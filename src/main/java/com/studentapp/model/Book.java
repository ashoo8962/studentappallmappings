package com.studentapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {

	@Column(length=20)
	private String bookName;
	@Id
	@GeneratedValue(generator="book_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="book_gen",sequenceName="book_seq",initialValue=11)
	private Integer bookId;
	@Column(length=20)
	private String bookTitle;
	@Column(length=20)
	private String genre; //novel poems story 
	
}
