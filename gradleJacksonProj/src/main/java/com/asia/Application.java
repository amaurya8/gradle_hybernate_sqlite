package com.asia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
/*        List sub =  new ArrayList<>();
        sub.add("math");
        Person p = new Person("Ashok","Maurya","12345",35,200000,"light greay",true,sub,
                new Address("C15",412207,"Radhik Vihar","Green9 Hotel",new House(2,4,"1BHK")));
        ObjectMapper mapper = new ObjectMapper();
       String strJson =  mapper.writeValueAsString(p);
       System.out.println(strJson);*/
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File("C:\\Users\\Ashok\\Desktop\\person.json"),Person.class);
        System.out.println(person.getAge() + " \n" + person.address.getPinCode());
    }
}
