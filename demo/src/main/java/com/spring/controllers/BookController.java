package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pojoclasses.Book;
import com.spring.services.BookServices;

@RestController
@GetMapping("/spring")
public class BookController {

	@Autowired
	BookServices bookService;
	
	
	@RequestMapping(value = "/getBooks")
	public String getBooks() {
		
		return bookService.getAllBooks().toString();
	}

	@RequestMapping(value = "/getBook/{id}", method = RequestMethod.GET)
	public String getBook(@PathVariable("id") Long id) {
		return bookService.getBookDetails(id);
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@RequestBody Book book) {
		System.out.println("Adding book");
		return bookService.addBook(book);
	}

	@RequestMapping(value = "/updateBook", method = RequestMethod.PUT)
	public String updateBook(@RequestBody Book book) {
		return bookService.updateBookDetails(book);
	}

	@RequestMapping(value = "/deleteBook/{id}", method = RequestMethod.DELETE)
	public String deleteBook(@PathVariable("id") Long id) {
		return bookService.deleteBook(id);
	}

	
}
