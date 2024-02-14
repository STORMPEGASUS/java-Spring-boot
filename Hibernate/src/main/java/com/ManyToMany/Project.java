package com.ManyToMany;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {


    @Id
    private int Pid;

    @Column(name = "project_name")
    private String projectName;


    @ManyToMany
    private List<Emp> employees;

    public Project(){

    }

    public Project(int pid, String projectName, List<Emp> employees) {
        Pid = pid;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Pid=" + Pid +
                ", projectName='" + projectName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
