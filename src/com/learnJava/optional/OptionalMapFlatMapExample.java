package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

	public static void optionalFlatMap() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			Optional<Bike> bikeOptional = studentOptional.flatMap(Student::getBike); //
			System.out.println("bikeOptional : " + bikeOptional);
		}
	}

	public static void optionalMap() {
		
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			Optional<String> nameOptional = studentOptional.map(Student::getName); //
			System.out.println("nameOptional : " + nameOptional.get());
		}
	}

	public static void optionalFilter() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() >= 3.5);
		studentOptional.ifPresent(student -> System.out.println(student));

	}

	public static void main(String[] args) {
		
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}
}
