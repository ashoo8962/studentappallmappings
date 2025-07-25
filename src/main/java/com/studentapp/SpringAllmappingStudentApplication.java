package com.studentapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.AddressDto;
import com.studentapp.model.BookDto;
import com.studentapp.model.ClassRoomDto;
import com.studentapp.model.StudentDto;
import com.studentapp.model.SubjectDto;
import com.studentapp.service.IStudentService;
import com.studentapp.service.ISubjectService;

@SpringBootApplication
public class SpringAllmappingStudentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringAllmappingStudentApplication.class, args);
	}
	@Autowired
	private IStudentService studentService;
	@Autowired
	private ISubjectService subjectService;
	
	
	@Override
	public void run(String... args) throws Exception {

		//one to one
		AddressDto address = new AddressDto("Kolata",null,"west bengal");
		//manytoone
		ClassRoomDto classRoom= new ClassRoomDto("Eighth Standard");
		//one to many
		
		BookDto book1= new BookDto("Balbharti",null,"Formulas","Math sums");
		BookDto book2= new BookDto("English",null,"Grammer","English speaking");
		BookDto book3= new BookDto("Science",null,"Encyclopaedia","Science Fcats");
		Set<BookDto> bookDtos = new HashSet<>(Arrays.asList(book1,book2,book3));

		//many to many
		
		SubjectDto subject1= new SubjectDto("Drawing",null,2500.00,"offline");
		SubjectDto subject2= new SubjectDto("History",null,1500.00,"online");
		SubjectDto subject3= new SubjectDto("Geography",null,3500.00,"offline");

		Set<SubjectDto> subjectDtos1 = new HashSet<>(Arrays.asList(subject1,subject2,subject3));

		//hobbies
		Set<String> hobbies =  new HashSet<>(Arrays.asList("Sports","Music"));

		StudentDto student1 = 
				new StudentDto("Ajay",null,address,bookDtos,classRoom,subjectDtos1,hobbies);
		//save the object
		studentService.addStudent(student1);
		
		StudentDto student2 = 
				new StudentDto("Riya",null,address,bookDtos,classRoom,subjectDtos1,hobbies);
		//save the object
		studentService.addStudent(student2);
		
		
		
		
	}
	
	
	
	

}
