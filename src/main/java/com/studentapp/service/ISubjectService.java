package com.studentapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentapp.model.StudentDto;
import com.studentapp.model.SubjectDto;

@Service
public interface ISubjectService {
	void addStudent(SubjectDto subjectDto);
	void updateStudent(SubjectDto subjectDto);
	void deleteStudent(int subjectId);

	List<SubjectDto> getAll();

	SubjectDto getById(int subjectId);
}
