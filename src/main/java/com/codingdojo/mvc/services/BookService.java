package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, String title, String description, String language, Integer numOfPages) {

    	Book book1 = bookRepository.findById(id).get();
    	if(book1 != null) {
    		book1.setTitle(title);
    		book1.setDescription(description);
    		book1.setLanguage(language);
    		book1.setNumberOfPages(numOfPages);
    		return bookRepository.save(book1);   		
    	} else {
    		return null;
    	}
    }
}
