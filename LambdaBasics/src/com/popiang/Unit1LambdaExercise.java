package com.popiang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1LambdaExercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				
			new Person("Shahril", "Mad Shah", 40),
			new Person("Umi Syafira", "Azmi", 30),
			new Person("Nur Shah Adriana", "Shahril", 1),
			new Person("Charles", "Darwin", 65),
			new Person("Lewin", "Carol", 52),
			new Person("Thomas", "Carlyle", 20)
			
		);
		
		// step 1: sort the list by name
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));		
		
		// step 2: create a method that prints all elements in the list
		printSome(people, (Person p) -> true);
		
		// step 3: create a method that prints people with last name beginning with c		
		printSome(people, (Person p) -> p.getLastName().startsWith("C"));
		
	}

	private static void printSome(List<Person> people, Predicate<Person> predicate) {
		for(Person p: people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
}

