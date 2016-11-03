package qin.sitc7.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TableTest
{
    @Test
    public void makeTable()
    {
        SessionFactory sessionFactory = (SessionFactory) new
                  ClassPathXmlApplicationContext("applicationContext.xml")
                  .getBean("sessionFactory");

        Session session = sessionFactory.openSession();
    }
}