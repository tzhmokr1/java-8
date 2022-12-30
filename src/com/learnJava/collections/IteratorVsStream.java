package com.learnJava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Book;

public class IteratorVsStream {

	public static void main(String[] args) {

		// Iterator
		List<Book> books = new ArrayList<>();

		// external iteration (collections)
		List<String> titles = new ArrayList<>();
		for (Book book : books) {
			titles.add(book.getTitle());
		}

		// Associate Iterator with a collection
		Iterator<Book> iterator = books.iterator();

		// inherently sequential
		// [item1, item2, item3, item4]
		// no parallelization
		while (iterator.hasNext()) {
			titles.add(iterator.next().getTitle());
		}

		// stream API - internal iteration
		// parallel quite easily
		List<String> titles2 = books.stream().map(Book::getTitle).collect(Collectors.toList());
		titles2.forEach(e -> System.out.println(e));
	}
}
