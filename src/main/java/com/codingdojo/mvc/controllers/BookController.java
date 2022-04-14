package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public String index( Model model) {
		
//		Book book = bookService.findBook(bookId);
//		model.addAttribute("book" , book);
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "show.jsp";
	}
}
