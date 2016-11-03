package qin.sitc7.test;

import org.junit.Test;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import qin.spring.spring3._new.ConfigurationApp;

import static qin.sitc7.core.SitcPrint.print7;

public class SpringTest
{
    private ApplicationContext apx = new
              ClassPathXmlApplicationContext("classpath:spring.xml");

    //region test_IOCAnnotationConfig
    @Test
    public void test_IOCAnnotationConfig()
    {
        print7.prints(apx.getBean("iocConfig"));
    }
    //endregion

    //region springAnnotTest
    @Test
    public void springAnnotTest()
    {
        Configuration c = null;
        ComponentScan c1 = null;
        EnableTransactionManagement c2 = null;
        EnableCaching c3 = null;
        EnableWebMvc c4 = null;
        EnableScheduling c5 = null;
        EnableAsync c6 = null;
        EnableAspectJAutoProxy c7 = null;
        EnableLoadTimeWeaving c8 = null;
        EnableSpringConfigured c9 = null;
    }
    //endregion

    //region spring_ConfigurationTest
    @Test
    public void spring_ConfigurationTest()
    {
        //print7.prints(apx.getBean("configurationApp"));
        ConfigurationApp c = (ConfigurationApp) apx.getBean("configurationApp");
        print7.prints(c.getDataSource());
    }
    //endregion
}

















