package com.aisa.sqlite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.List;

public class PersistenceTest {
    SessionFactory factory;

    @BeforeClass
    public void setup() {

/*        Configuration configuration = new Configuration()
                .addAnnotatedClass(Message.class)
                .setProperty("hibernate.connection.driver_class", "org.sqlite.JDBC")
                .setProperty("hibernate.connection.url", "jdbc:sqlite:test.sqlite")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.SQLiteDialect")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.hdm2ddl.auto", "create-drop");
        configuration.configure();*/

        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();


//        factory = new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void saveMessage() {
        Message message = new Message("Welcome to Java");
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(message);
        tx.commit();
        session.close();
    }

    @Test(dependsOnMethods = "saveMessage")
    public void readMessage() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<Message> list = (List<Message>) session.createQuery("from Message").list();
        if (list.size() > 1) {
            Assert.fail("Message configuration in error; table should contain only one."
                    +" Set ddl to create-drop.");
        }
        if (list.size() == 0) {
            Assert.fail("Read of initial message failed; check saveMessage() for errors."
                    +" How did this test run?");
        }
        for (Message m : list) {
            System.out.println(m);
        }
        session.close();
    }
}
