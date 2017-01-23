package org.binggo.testspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring 
{
	private static final String SPRING_XML_FILE = "spring.xml";
	
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_XML_FILE);
		Person person = (Person) context.getBean("person");
		person.sayHello();
		person.run();
		
		/*
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(SPRING_XML_FILE));
        Person person = (Person) beanFactory.getBean("person");
        person.run();
        */
    }
}
