package com.studentapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.exception.StudentNotFoundException;
import com.studentapp.model.Student;
import com.studentapp.model.StudentDto;
import com.studentapp.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public void addStudent(StudentDto studentDto) {
		Student student = mapper.map(studentDto, Student.class);
		studentRepository.save(student);
	}

	@Override
	public void updateStudent(StudentDto studentDto) {
		Student student = mapper.map(studentDto, Student.class);
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int studentId)
	{
		studentRepository.deleteById(studentId);
	}

	@Override
	public List<StudentDto> getAll() {

		return	studentRepository.findAll()
				.stream()
				.map(student -> mapper.map(student, StudentDto.class))
				.toList();
	
	}

	@Override
	public StudentDto getById(int studentId) {
		Student student = studentRepository.findById(studentId)
				.orElseThrow(()->new StudentNotFoundException("invalid student"));
		return mapper.map(student,StudentDto.class);
		
	}

}
