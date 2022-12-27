package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

	
    private static List<String> namesList() {
    	List<String> studentList = StudentDataBase.getAllStudents().stream()
    																.map(Student::getName)
    																.map(String::toUpperCase)
    																.collect(Collectors.toList());
    	return studentList;
    }
    
    
    
    private static Set<String> namesSet() {
    	Set<String> studentSet = StudentDataBase.getAllStudents().stream()
    																.map(Student::getName)
    																.map(String::toUpperCase)
    																.collect(Collectors.toSet());
    	return studentSet;
    }




    public static void main(String[] args) {
    	
    	System.out.println(namesList());
    	System.out.println(namesSet());
    }
}
