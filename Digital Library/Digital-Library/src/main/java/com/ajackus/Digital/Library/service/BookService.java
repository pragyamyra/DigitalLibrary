package com.ajackus.Digital.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ajackus.Digital.Library.Model.Book;
import com.ajackus.Digital.Library.repository.BookRepository;



@Service
public class BookService {
	
private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    
    public Optional<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }
    
    public Book updateBook(Long id, Book bookDetails) {
        return bookRepository.findById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setGenre(bookDetails.getGenre());
            book.setAvailabilityStatus(bookDetails.getAvailabilityStatus());
            return bookRepository.save(book);
        }).orElseThrow(() -> new RuntimeException("Book not found"));
    }
    
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
