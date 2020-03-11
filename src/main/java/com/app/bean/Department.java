package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Department {
    @Value("IT DEV")
    private String name;
    @Value("23/02/2020")
    private Date createdOn;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
