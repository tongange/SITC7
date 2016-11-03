package qin.spring.spring3._new;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import qin.javaee7.core.JavaEE7BaseSupport;

import javax.sql.DataSource;

@Configuration
@SuppressWarnings("all")
public class ConfigurationApp implements JavaEE7BaseSupport
{
    private static final long serialVersionUID = 7596987520455186255L;

    private String url = "jdbc:mysql://localhost:3306/javaee7oa";

    private String username = "tongange";

    private String password = "tongange";

    @Bean
    public DataSource getDataSource()
    {
        return new DriverManagerDataSource(url, username, password);
    }
}