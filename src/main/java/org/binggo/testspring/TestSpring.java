package org.binggo.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring 
{
	private static final String XML_FILE = "spring.xml";
	
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(XML_FILE);
        Person person = (Person) context.getBean("person");
        System.out.println(String.format("Person's name: %s", person.getName()));
    }
}
