package br.com.marcelo;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
	BookRepository repository;
 
    @RequestMapping("/book")
    public Book load(@RequestParam(value="name", defaultValue="World") String name) {
    	Book book = new Book();
    	book.setId(counter.incrementAndGet());
    	book.setTitle(String.format(template, name));
    	return book;
    }
    
    @RequestMapping("/book/List")
    public List<Book> loadList(@RequestParam(value="name", defaultValue="World") String name) {  
    	
        List<Book> books = (List<Book>) repository.findAll();
    	return  books;
    }
    
    @RequestMapping("/book/Save")
    public Book save(@RequestBody Book book) {    	
    	return book;
    }
}
 
    

