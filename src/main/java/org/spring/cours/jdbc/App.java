package org.spring.cours.jdbc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args ) {
        JbdcConfiguration jbdcConfiguration = new JbdcConfiguration();
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(jbdcConfiguration.dataSource());

        //DataSource dataSource = JbdcConfiguration.dataSource();
        System.out.println( "Hello World!" );
    }
}
