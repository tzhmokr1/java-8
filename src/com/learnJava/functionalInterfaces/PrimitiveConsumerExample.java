package com.learnJava.functionalInterfaces;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumerExample {

	static IntConsumer intc1 = c -> System.out.println(c * c);
	static DoubleConsumer doublec2 = c -> System.out.println(c * c);
	static LongConsumer longc3 = c -> System.out.println(c * c);

	public static void main(String[] args) {

		intc1.accept(3);
		doublec2.accept(3.0);
		doublec2.accept(2);
		longc3.accept(5);
	}
}
