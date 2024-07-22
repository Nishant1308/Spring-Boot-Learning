package com.nishantspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nishantspringboot.entity.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(4567,"ghjkl","rtyui"));
		list.add(new Book(98765,"rtyuio","ertyu"));
		list.add(new Book(987,"fghjk","rtyu"));
	}
	
	//get All books
	public List<Book> getAllBooks(){
		return list;
	}
	
	//get book by id
	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e-> e.getId()==id).findFirst().get();
		return book;
	}
}
