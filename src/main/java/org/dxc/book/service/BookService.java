package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;

public interface BookService {

	List<Book> findAll();

	Object saveBook(Book book);

	void deleteBYId(int id);

	Optional<Book> getBook(int id);

	void update(int id, Book book);
    
	List<Book> fetchbyauthorname(String authorname);

	List<Book> fethbypublisher(String publisher);

	List<Book> fetchbycategory(String category);



}
