package com.nishantspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nishantspringboot.entity.Book;
import com.nishantspringboot.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getAllBooks();
	}

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.bookService.getBookById(id);
	}

	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		this.bookService.addBook(book);
		return book;
	}

	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		this.bookService.deleteBook(id);
	}

	@PutMapping("/updateBook/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		this.bookService.updateBook(book, id);
		return book;
	}
}
