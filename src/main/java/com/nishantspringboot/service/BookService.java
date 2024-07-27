package com.nishantspringboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishantspringboot.entity.Book;
import com.nishantspringboot.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	// get All books
	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>)this.bookRepository.findAll();
		
		return list;
	}

	// get book by id
	public Book getBookById(int id) {
		Book book = this.bookRepository.findById(id);
		
		return book;
	}

	// add book
	public Book addBook(Book b) {
		Book book = bookRepository.save(b);
		return book;
	}

	// delete book
	public void deleteBook(int id) {
		this.bookRepository.deleteById(id);
	}

	// update book
	public void updateBook(Book book, int id) {
		book.setId(id);
		bookRepository.save(book);
	}
}
