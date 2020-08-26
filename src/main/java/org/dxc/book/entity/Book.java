package org.dxc.book.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8734067326291496554L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bid")        ////different as in table and property name
	private int id;
	@Column(name="bookname")   //different as in table and property name
	private String name;
	//@Column(name="authorname") same as in table and property name
	private String authorname;
	//@Column(name="publisher")  same as in table and property name
	private String publisher;
	//@Column(name="isbn")       same as in table and property name
	private String isbn;
	//@Column(name="category")   same as in table and property name
	private String category;
	//@Column(name="price")      same as in table and property name
	private double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int id, String name, String authorname, String publisher, String isbn, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.authorname = authorname;
		this.publisher = publisher;
		this.isbn = isbn;
		this.category = category;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorname=" + authorname + ", publisher=" + publisher
				+ ", isbn=" + isbn + ", category=" + category + ", price=" + price + "]";
	} 
	
	
	

}
