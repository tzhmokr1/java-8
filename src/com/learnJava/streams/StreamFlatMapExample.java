package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFlatMapExample {

	
    public static List<String> printStudentActivities() {
    	
    	List<String> studentActivities = StudentDataBase.getAllStudents()
														.stream()
														.map(Student::getActivities)	//Stream<List<String>
														.flatMap(List::stream)			//Stream<String>
														.distinct()
														.sorted()
														.collect(Collectors.toList());
									
    	return studentActivities;
    }
    
    
    
    public static long printStudentActivitiesCount() {
    
		long noOfStudentActivities = StudentDataBase.getAllStudents()
													.stream()
													.map(Student::getActivities)	//Stream<List<String>
													.flatMap(List::stream)			//Stream<String>
													.distinct()
													.count();
			
	return noOfStudentActivities;
}

    
    
    public static void main(String[] args) {

        System.out.println("Student Activities :	    " + printStudentActivities());
        System.out.println("getStudentActivitiesCount : " + printStudentActivitiesCount());
    }
}
