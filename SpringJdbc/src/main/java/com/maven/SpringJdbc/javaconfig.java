package com.maven.SpringJdbc;


import com.maven.SpringJdbc.dao.StudentDao;
import com.maven.SpringJdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.maven.SpringJdbc.dao")
public class javaconfig {


    @Bean("ds")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("Chote@123");

        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource() );
        return template;
    }


    @Bean("studentbean")
    public StudentDao getStudentDao() {

        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(getTemplate());
        return studentDao;

    }

}
