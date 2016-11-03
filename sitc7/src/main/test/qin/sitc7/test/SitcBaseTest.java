package qin.sitc7.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import qin.javaee7.core.JavaEE7BaseSupport;

import static qin.javaee7.core.spring.SpringTools.spring_INSTANCE;

/**
 * using for save data testing<br>
 * when you save data then extends this class
 *
 * @author qinzhengying
 * @since 1.7
 */
@ContextConfiguration(value = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@SuppressWarnings("all")
public class SitcBaseTest implements JavaEE7BaseSupport
{
    protected static Session session = null;

    protected static Transaction transaction = null;

    @BeforeClass
    public static void ini()
    {
        session = spring_INSTANCE.getSessionFactory().openSession();
        transaction = session.beginTransaction();
    }

    @AfterClass
    public static void commit()
    {
        transaction.commit();
    }
}