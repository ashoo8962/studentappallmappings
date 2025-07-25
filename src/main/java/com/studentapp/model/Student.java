package com.studentapp.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

	@Column(length = 30)
	private String studentName;
	@Id
	@GeneratedValue(generator = "student_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "student_gen", sequenceName = "student_seq", initialValue = 1)
	private Integer studentId;
	//done
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	//done
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="student_id")
	private Set<Book> books;
	
//done
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="classRoom_id")
	private ClassRoom classRoom;
	
	@ManyToMany(cascade= CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "student_courses",
	joinColumns= @JoinColumn(name="student_id"),
			inverseJoinColumns= @JoinColumn(name="subject_id"))
	private Set<Subject> subjects;
	
	@ElementCollection
	@CollectionTable(name="hobbies")
	private Set<String> hobbies;
	
	
	
	
	
	
	
	
	
}
