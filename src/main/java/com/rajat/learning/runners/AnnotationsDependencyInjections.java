package com.rajat.learning.runners;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.learning.interfaces.Coach;

public class AnnotationsDependencyInjections {

	public static void main(String[] args) {
		// Read The Spring COnfig File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the Bean from Spring Container(Named) - Constructor Dependency Injection
		Coach sillyCoach = context.getBean("sillyTennisCoach",Coach.class);
		
		
		//Setter Dependency Injection
		Coach kabaddiCoach = context.getBean("kabaddiCoach",Coach.class);
		
		//Method Dependency Injection
		Coach khokhoCoach = context.getBean("khoKhoCoach",Coach.class);
		
		// Qualifer Annotation
		Coach badmintonCoach = context.getBean("badmintonCoach",Coach.class);
		
		
		// call a method on the bean
		System.out.println(sillyCoach.getDailyWorkouts());
		System.out.println(sillyCoach.getFortune());
		
		//Setter Dependency Injection
		System.out.println(kabaddiCoach.getDailyWorkouts());
		System.out.println(kabaddiCoach.getFortune());
		
		//Method Dependency Injection
		System.out.println(khokhoCoach.getDailyWorkouts());
		System.out.println(khokhoCoach.getFortune());
		
		//Qualifier Dependency Injection
		System.out.println(badmintonCoach.getDailyWorkouts());
		System.out.println(badmintonCoach.getFortune());
		
		
		//close the context
		context.close();

	}

}
