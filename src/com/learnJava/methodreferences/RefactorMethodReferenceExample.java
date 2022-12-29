package com.learnJava.methodreferences;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import com.learnJava.functionalInterfaces.SupplierExample;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = RefactorMethodReferenceExample::greaterThanGreadeLevel;
	
	static public boolean greaterThanGreadeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	
	
	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
	}
}
