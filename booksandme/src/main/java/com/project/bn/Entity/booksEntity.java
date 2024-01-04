package com.project.bn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookdetails1")
public class booksEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="isbn")
	private String isbn;
	@Column(name="bookname")
	private String bookname;
	@Column(name="author")
	private String author;
	@Column(name="genre")
	private String genre;
	@Column(name="pages")
	private int Pages;
	@Column(name="price")
	private int price;
	@Column(name="booktype")
	private String booktype;
	@Column(name="oroiginallanguage")
	private String originallanguage;
	@Column(name="publication")
	private String publication;
	public booksEntity(int id, String isbn, String bookname, String author, String genre, int pages, int price,
			String booktype, String originallanguage, String publication) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.bookname = bookname;
		this.author = author;
		this.genre = genre;
		Pages = pages;
		this.price = price;
		this.booktype = booktype;
		this.originallanguage = originallanguage;
		this.publication = publication;
	}
	public booksEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		Pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public String getOriginallanguage() {
		return originallanguage;
	}
	public void setOriginallanguage(String originallanguage) {
		this.originallanguage = originallanguage;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
}
//"isbn":"9781409181637",
//"bookname":"The Silent Patient",
//"author":"Alex Michaelides",
//"genre":"Psychological thriller",
//"pages": 339 ,
//"price": 399,
//"booktype":"Fiction",
//"originallanguage":"English",
//"publication":"5 February 2019"

