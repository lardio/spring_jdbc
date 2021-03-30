package org.spring.cours.jdbc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args ) {

        //DataSource dataSource = JbdcConfiguration.dataSource();
        System.out.println( "Hello World!" );
    }
}
