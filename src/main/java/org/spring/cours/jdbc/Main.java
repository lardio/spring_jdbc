package org.spring.cours.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        JbdcConfiguration jbdcConfiguration = context.getBean(JbdcConfiguration.class);
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(jbdcConfiguration.dataSource());
    }

}
