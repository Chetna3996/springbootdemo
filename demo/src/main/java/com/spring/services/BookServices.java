package com.spring.services;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.spring.pojoclasses.Book;

@Service
public class BookServices {
	
	private static Map<Long,Book> bookStore=new HashMap<Long,Book>();
	Gson gson=new Gson();
	
	public String getAllBooks() {
		
		return gson.toJson(bookStore);
	}

	public String getBookDetails(Long id) {
		Book book=null;
		String result="";
		if(bookStore.get(id)!=null){
			gson=new Gson();
			result=gson.toJson(bookStore.get(id));
		}else
			result="Book is not available in book store";
		return result;
	}

	public String addBook(Book book){
		String result="";
		if(!bookStore.containsKey(book.getBookId())){
			bookStore.put(book.getBookId(), book);
			result="Successfully added";
		}else{
			result="Book with id: "+book.getBookId()+" already present";
		}
		return result;
	}
	public String updateBookDetails(Book book) {
		String result="";
		if(bookStore.containsKey(book.getBookId())){
			bookStore.put(book.getBookId(), book);
			result="Successfully updated";
		}else{
			result="Book with id: "+book.getBookId()+" is not present";
		}
		return result;
	}

	public String deleteBook(Long id) {
		String result="";
		if(bookStore.containsKey(id)){
			bookStore.remove(id);
			result="Successfully deleted";
		}else{
			result="Book with id: "+id+" is not present";
		}
		return result;
	}
	
	

}
