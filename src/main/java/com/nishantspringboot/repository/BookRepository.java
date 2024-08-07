package com.nishantspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.nishantspringboot.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);

}
