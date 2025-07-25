package com.studentapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentapp.model.ClassRoomDto;
import com.studentapp.model.StudentDto;
import com.studentapp.model.SubjectDto;

@Service
public interface IClassRoomService {
	void addStudent(ClassRoomDto classRoomDto);
	void updateStudent(ClassRoomDto classRoomDto);
	void deleteStudent(int classRoomId);

	List<ClassRoomDto> getAll();

	ClassRoomDto getById(int classRoomId);
}
