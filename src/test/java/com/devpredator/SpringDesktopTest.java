package com.devpredator;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devpredator.model.dao.DisqueraDao;

/**
 * @author Axel
 * Clase de prueba unitaria q permite realizar pruebas con el framework spring
 */
public class SpringDesktopTest {

	
	@Test
	public void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		DisqueraDao disqueraDao = (DisqueraDao) context.getBean("disqueraDao");
		assertNotNull(disqueraDao);
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDao);
	
	
		//:::::::::::::::.properties:::::::::::::::::::
		
		Properties properties = (Properties)context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
