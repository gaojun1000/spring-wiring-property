package com.stuff2share;

import com.stuff2share.x.Person;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jgao on 2/24/16.
 */
public class TestWiringPropertyValue {
    @Test
    public void testContextAnnotation() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        Person person = applicationContext.getBean(Person.class);
        assertEquals("Joe", person.getName());
    }

}
