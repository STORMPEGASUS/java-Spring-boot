package com.maven.SpringJdbc.dao;

import com.maven.SpringJdbc.Dto.Student;
import org.springframework.context.annotation.Bean;

public interface StudentDao {

    public int Insert(Student student);
    public int Change(Student student);
    public int Remove(int id);
}
