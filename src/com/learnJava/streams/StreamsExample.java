package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >= 3.9;

		/*
		 * List<String> names = Arrays.asList("adam","dan","jenny"); names.stream();
		 * names.parallelStream(); StudentDataBase.getAllStudents().stream();
		 * StudentDataBase.getAllStudents().parallelStream();
		 */

		
		// Streams are lazy
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
										.filter(studentPredicate)
										.filter(studentGpaPredicate)
										.peek((i -> {	// used to debug
											System.out.println("After 2nd filter:  " + i);
										}))
										.collect(Collectors.toMap(Student::getName, Student::getActivities)); // collect starts the whole process
		System.out.println("studentMap  : " + studentMap);

		

	}
}
