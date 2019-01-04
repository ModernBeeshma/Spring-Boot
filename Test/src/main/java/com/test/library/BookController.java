package com.test.library;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@Value("{welcome.hello}")
	String hi;
	@RequestMapping("/hi")
	
	public String display()
	{
		System.out.println(hi);
		return hi;
	}
	@RequestMapping("/books")
public List<Books> getAllBooks()
{
	return bookService.getAllBooks();
		
}
	@RequestMapping(method=RequestMethod.POST,value="/books")
	public void addBook(@RequestBody Books book)
	{
		bookService.addBook(book);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/books/{id}")
	public void putBook(@RequestBody Books book,@PathVariable String id)
	{
		bookService.updateBook(book,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/books/{id}")
	public void deleteBook(@PathVariable String id)
	{
		bookService.deleteBook(id);
	}
}
