package org.dxc.book.controller;

import java.util.List;
import java.util.Optional;

import org.dxc.book.entity.Book;
import org.dxc.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	// Find BOOKS
	@RequestMapping("/findall")
	public List<Book> findAllBooks(){
		System.out.println("======findAllBooks======");
		return bookService.findAll();
		
	}
	// SAVE BOOK
	@RequestMapping(value="/save",method=RequestMethod.POST) // to know the status(error)
	public HttpStatus insertEmployee(@RequestBody Book book) { // to inject
		boolean status =bookService.saveBook(book)!=null;
		System.out.println("=====insertEmployee=======");
		return status? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	// DELETING BOOK
   @RequestMapping("/delete")
	public void deleteBook(@RequestParam("id")int id) {
		System.out.println("=====deleteBook=====");
		bookService.deleteBYId(id);
	}
	//  GETING A BOOK BY ID
   @RequestMapping("/byid")
   public Optional<Book> getabook(@RequestParam("id")int id){
	   Optional<Book> result=bookService.getBook(id);
	   return result;
   }
   // UPDATE BOOK OF EXISTING BOOK
   @RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
   public void update(@PathVariable("id")int id,@RequestBody Book book) {
	   System.out.println("==update==");
	   bookService.update(id,book);
	   
   }// userdefined methods "fetchbyauthorname","publisher","fetchbycategory"
   @RequestMapping("/fetchbyauthorname")
   public List<Book> fetchbyauthorname(@RequestParam("authorname") String authorname){
	   return bookService.fetchbyauthorname(authorname);
   }
   @RequestMapping("/publisher")
   public List<Book> fetchbypublisher(@RequestParam("publisher")String publisher){
	   return bookService.fethbypublisher(publisher);
   }
   @RequestMapping("/fetchbycategory")
   public List<Book> fetchbycategory(@RequestParam("category")String category){
       return bookService.fetchbycategory(category);
   }
}
   

