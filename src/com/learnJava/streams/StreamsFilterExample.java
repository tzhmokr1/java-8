package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

	public static List<Student> filterStudents() {
		
		return StudentDataBase.getAllStudents().stream()
										.filter(student -> student.getGender().equals("female"))
										.filter(student -> student.getGpa() >= 3.9)
										.collect(toList());

	}

	public static void main(String[] args) {

        filterStudents().forEach(System.out::println);

    }
}
