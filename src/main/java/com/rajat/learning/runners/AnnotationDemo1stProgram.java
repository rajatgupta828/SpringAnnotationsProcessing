package com.rajat.learning.runners;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.learning.interfaces.Coach;

public class AnnotationDemo1stProgram {

	public static void main(String[] args) {
		// Read The Spring COnfig File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the Bean from Spring Container(Named)
		Coach sillyCoach = context.getBean("sillyTennisCoach",Coach.class);
		
		// Get the Default Name BeanID
		
		Coach basketBall = context.getBean("basketballCoach",Coach.class);
		
		
		// call a method on the bean
		System.out.println(sillyCoach.getDailyWorkouts());
		System.out.println(basketBall.getDailyWorkouts());
		
		//close the context
		context.close();

	}

}
