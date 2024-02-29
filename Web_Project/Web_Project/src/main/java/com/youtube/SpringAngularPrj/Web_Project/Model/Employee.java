package com.youtube.SpringAngularPrj.Web_Project.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
//This annotation will automatically create the table with class name in mysql database
// mentioned in application.prperties file
@Table(name = "Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false, updatable = false)
    private long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "MAIL")
    private String Emailid;

    private Employee(){

    }
    public Employee(String name, String emailid) {
        this.name = name;
        this.Emailid = emailid;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Emailid='" + Emailid + '\'' +
                '}';
    }

}
