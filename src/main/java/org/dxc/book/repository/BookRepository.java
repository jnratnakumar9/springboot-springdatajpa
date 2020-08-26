package org.dxc.book.repository;

import java.util.List;

import org.dxc.book.dao.Bookdao;
import org.dxc.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository // it is used to do CRUD operation through JPA
public interface BookRepository extends JpaRepository<Book,Integer> {
    
	@Query("SELECT b From Book b WHERE b.authorname=:authorname")
	List<Book> fetchbyauthorname(String authorname);
	@Query("SELECT b From Book b WHERE b.publisher=:publisher")
	List<Book> fethbypublisher(String publisher);
	@Query("SELECT b From Book b Where b.category=:category")
	List<Book> fetchbycategory(String category);
    
	/*public static final Bookdao bookdao = null;
	static String saveBook(Book book) {
		return bookdao.saveBook(book);
		
	}*/

}
