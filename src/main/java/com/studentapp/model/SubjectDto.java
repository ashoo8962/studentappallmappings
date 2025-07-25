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
@ToString(exclude="students")
public class SubjectDto {

	private String subjectName;
	private Integer subjectId;
	private double fees;
	private String mode; // online or off or softskill
	private Set<Student> students;
	public SubjectDto(String subjectName, Integer subjectId, double fees, String mode) {
		super();
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.fees = fees;
		this.mode = mode;
		
	}
	
	
	
}
