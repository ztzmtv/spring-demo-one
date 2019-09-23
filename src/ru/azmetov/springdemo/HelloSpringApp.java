package ru.azmetov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// загрузка конфига Spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//извлечение бинов из контейнеров
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//вызов методов бина
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		//закрываем контекст
		context.close();
	}

}
