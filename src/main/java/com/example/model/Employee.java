package com.example.model;

import org.springframework.data.redis.core.RedisHash;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@RedisHash("Employee")
public class Employee implements Serializable {


    private String id;

    @NotBlank(message = "Name is mandatory")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    private String emailId;


    public Employee() {}

    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + '}';
    }
}
