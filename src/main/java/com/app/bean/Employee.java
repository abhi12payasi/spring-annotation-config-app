package com.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee{
    @Value("abhi")
    private String name;
    @Value("24")
    private Integer age;
    @Value("23432.2")
    private Double salary;
    @Value("#{taskList}")
    private List<String> taskList;

    @Autowired  // OR  @Value("#{department}")
    private Department department;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", taskList='" + taskList + '\'' +
                ", department=" + department +
                '}';
    }
}
