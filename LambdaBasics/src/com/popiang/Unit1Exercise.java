package com.popiang;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

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
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// step 2: create a method that prints all elements in the list
		printAll(people);
		
		// step 3: create a method that prints people with last name beginning with c
		printSome(people, new Condition() {
			public boolean test(Person p) {
				if (p.getFirstName().startsWith("C"))
					return true;
				return false;
			}
		});
		
	}

	private static void printSome(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p);
		}
	}

}

interface Condition {
	public boolean test(Person p);
}



