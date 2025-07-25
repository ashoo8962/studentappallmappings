package com.studentapp.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString(exclude="students")
public class Subject {

	private String subjectName;
	@Id
	@GeneratedValue(generator = "subject_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "subject_gen", sequenceName = "subject_seq", initialValue = 101)
	private Integer subjectId;
	private double fees;
	private String mode; // online or off or softskill
	@ManyToMany(mappedBy = "subjects")
	private Set<Student> students;
	
	
	
}
