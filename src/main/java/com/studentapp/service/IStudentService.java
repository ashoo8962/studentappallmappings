package com.studentapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentapp.model.StudentDto;

@Service
public interface IStudentService {
	void addStudent(StudentDto studentDto);
	void updateStudent(StudentDto studentDto);
	void deleteStudent(int studentId);

	List<StudentDto> getAll();

	StudentDto getById(int studentId);
}
