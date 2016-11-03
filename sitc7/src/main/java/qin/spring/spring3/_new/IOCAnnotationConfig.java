package qin.spring.spring3._new;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import qin.javaee7.core.JavaEE7BaseSupport;

import javax.sql.DataSource;

//@Configuration("iocConfig")
@SuppressWarnings("all")
public class IOCAnnotationConfig implements JavaEE7BaseSupport
{
    private static final long serialVersionUID = -3571205353826137844L;

    private
    @Value("#{jdbcProperties.jdbc_url}")
    String jdbc_url;

    private
    @Value("#{jdbcProperties.jdbc_username}")
    String jdbc_username;

    private
    @Value("#{jdbcProperties.jdbc_password}")
    String jdbc_password;

    @Bean
    public DataSource dataSource()
    {
        return new DriverManagerDataSource(jdbc_url, jdbc_username, jdbc_password);
    }
}