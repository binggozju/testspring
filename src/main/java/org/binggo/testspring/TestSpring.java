package org.binggo.testspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestSpring 
{
	private static final String XML_FILE = "spring.xml";
	
	public static void main( String[] args )
    {
		//ApplicationContext context = new ClassPathXmlApplicationContext(XML_FILE);
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(XML_FILE));
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(String.format("Person's name: %s", person.getName()));
    }
}
