package com.ManyToMany;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Emp {

     @Id
     private int EmpID;

     @Column(name = "emp_name")
     private String EmpName;

     @ManyToMany
     private List<Project> projects;


     public Emp() {

     }


    @Override
    public String toString() {
        return "Emp{" +
                "EmpID=" + EmpID +
                ", EmpName='" + EmpName + '\'' +
                ", projects=" + projects +
                '}';
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Emp(int empID, String empName, List<Project> projects) {
        EmpID = empID;
        EmpName = empName;
        this.projects = projects;
    }
}
