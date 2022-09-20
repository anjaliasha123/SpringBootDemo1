package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring conf file
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retreive a bean
		Coach c1 = appContext.getBean("myCoach",Coach.class);
		Coach c2 = appContext.getBean("bbCoach",Coach.class);
		//call the method on bean
		System.out.println(c1.getDailyWorkout());
		System.out.println(c2.getDailyWorkout());
		//close the context
		appContext.close();

	}

}
