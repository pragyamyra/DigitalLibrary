package com.ajackus.Digital.Library.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(nullable = false)
	    private String title;
	    
	    @Column(nullable = false)
	    private String author;
	    
	    private String genre;
	    
	    @Column(nullable = false)
	    private String availabilityStatus; // "Available" or "Checked Out"
	}
