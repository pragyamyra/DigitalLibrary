package com.ajackus.Digital.Library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajackus.Digital.Library.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
   
	 Optional<Book> findByTitle(String title);
}
