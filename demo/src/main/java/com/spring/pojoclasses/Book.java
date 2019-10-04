package com.spring.pojoclasses;

public class Book {

	private String bookName;
	private Long bookId;
	private String author;
	private String publisher;
	private Integer volumes;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getVolumes() {
		return volumes;
	}
	public void setVolumes(Integer volumes) {
		this.volumes = volumes;
	}
	
	
}
