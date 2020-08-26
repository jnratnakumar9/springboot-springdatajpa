package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;
import org.dxc.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService  {
	
	@Autowired
	private BookRepository bookRepository;

	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}


	public Object saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book) ;
	}


	@Override
	public void deleteBYId(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
		
	}

	@Override
	public Optional<Book> getBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}


	@Override
	public void update(int id, Book book) {
		// TODO Auto-generated method stub
		Book updatebook=bookRepository.getOne(id);
		updatebook.setName(book.getName());
		updatebook.setAuthorname(book.getAuthorname());
		updatebook.setPublisher(book.getPublisher());
		updatebook.setIsbn(book.getIsbn());
		updatebook.setCategory(book.getCategory());
		updatebook.setPrice(book.getPrice());
		bookRepository.save(updatebook);
		
	}


	@Override
	public List<Book> fetchbyauthorname(String authorname) {
		// TODO Auto-generated method stub
		return bookRepository.fetchbyauthorname(authorname);
	}


	@Override
	public List<Book> fethbypublisher(String publisher) {
		// TODO Auto-generated method stub
		return bookRepository.fethbypublisher(publisher);
	}


	@Override
	public List<Book> fetchbycategory(String category) {
		// TODO Auto-generated method stub
		return bookRepository.fetchbycategory(category);
	}


	
	


	









}
