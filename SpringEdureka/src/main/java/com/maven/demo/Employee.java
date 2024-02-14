package com.maven.demo;

public class Employee {

   private int eid;
   private String name;
   private String salary;
   private Address address;


   public Employee(){}

    public int getEid() {
        return eid;
    }

    //constuctor injection
    public Employee(Address address){
        this.address = address;
    }

    public Employee(int eid, String name, String salary, Address address) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", address=" + address +
                '}';
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }


    //setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    public void myInit(){
        System.out.println("object is initialized");
    }

    public void mydestroy(){
        System.out.println("object is destroyed");
    }
}
