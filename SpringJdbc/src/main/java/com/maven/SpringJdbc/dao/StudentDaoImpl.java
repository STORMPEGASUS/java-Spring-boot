package com.maven.SpringJdbc.dao;

import com.maven.SpringJdbc.Dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class StudentDaoImpl implements StudentDao{



    private JdbcTemplate jdbcTemplate;

    @Override
    public int Insert( Student student) {
        //insert query
        String query = "insert into student (id,name,city) values(?,?,?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int Change(Student student) {
        String Query="update student set name=?,city=? where id=?";
        return this.jdbcTemplate.update(Query, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int Remove(int id) {
        String Query="delete from student where id=?";
        return this.jdbcTemplate.update(Query, id);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
