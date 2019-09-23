package ru.azmetov.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// создание объекта
		Coach theCoach = new TrackCoach();
		
		// использование объекта
		System.out.println(theCoach.getDailyWorkout());

	}

}
