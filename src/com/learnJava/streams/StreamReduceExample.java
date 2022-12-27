package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {

		return integerList.stream()
				// 1
				// 3
				// 5
				// 7
				// 'a' = is always the result
				// 'b' = comes from the Stream
				// a= 1, b=1 => result is 1
				// a= 1, b=3 => result is 3
				// a= 3, b=5 => result is 15
				// a=15, b=7 => result is 105
				.reduce(1, (a, b) -> a * b);

	}

	// The Optional handels the null value without Idendity gracefully
	public static Optional<Integer> performMultiplicationWithoutIdendity(List<Integer> integerList) {

		return integerList.stream().reduce((a, b) -> a * b);
	}
	
	public static Optional<Student> getHightestGpaStudent() {
		
		return StudentDataBase.getAllStudents().stream()
												.reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
	}

	
	
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 3, 5, 7);
		List<Integer> integers1 = Arrays.asList();
		
		System.out.println(performMultiplication(integers));
		
		Optional<Integer> result = performMultiplicationWithoutIdendity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		Optional<Integer> result1 = performMultiplicationWithoutIdendity(integers1);
		if(result1.isPresent()) {
			System.out.println(result1.get());
		}
		
		Optional<Student> studentOptional = getHightestGpaStudent();
		if (studentOptional.isPresent()) {
			System.out.println(studentOptional.get());
		}
		
		
		
		
		

	}
}
