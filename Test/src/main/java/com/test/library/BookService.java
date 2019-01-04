package com.test.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	private List<Books> books=new ArrayList<>(Arrays.asList(
				new Books("1","Harry Potter and philosopher stone","500$"),
				new Books("2","Harry Potter and Chambers of secret","799$"),
				new Books("3","Game of Thrones dancing dragons","854$"),
				new Books("4","Game of Thrones song of ice and fire","854$")));
	public List<Books> getAllBooks()
	{
		return books;
	}
	public Books getBook(String id)
	{
		return books.stream().filter(b->b.getId().equals(id)).findFirst().get();  //Kind of lambda expression.
	}
	public void addBook(Books book) {
		books.add(book);
	}
	public void updateBook(Books book, String id) {
		for(int i=0;i<books.size();i++)
		{
			Books b=books.get(i);
			if(b.getId().equals(id))
			{
				books.set(i, book);
				return;
			}
		}
		
	}
	public void deleteBook(String id) {
		books.removeIf(b->b.getId().equals(id));
		
	}
}
