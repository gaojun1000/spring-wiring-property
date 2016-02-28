package com.stuff2share.x;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jgao on 2/24/16.
 */
@Component
public class Person {

    @Value("${person.name}")
    private String name;

    public Person() {
        System.out.println("creating bean Person: " + this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
