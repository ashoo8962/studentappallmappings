package com.studentapp.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.exception.SubjectNotFoundException;
import com.studentapp.model.Subject;
import com.studentapp.model.SubjectDto;
import com.studentapp.repository.ISubjectRepository;

@Service
public class SubjectServiceIpl implements ISubjectService {

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private ISubjectRepository subjectRepository;

	@Override
	public void addStudent(SubjectDto subjectDto) {

		Subject subject = mapper.map(subjectDto, Subject.class);
		subjectRepository.save(subject);
	}

	@Override
	public void updateStudent(SubjectDto subjectDto) {
		Subject subject = mapper.map(subjectDto, Subject.class);
		subjectRepository.save(subject);
	}

	@Override
	public void deleteStudent(int subjectId) {
		subjectRepository.deleteById(subjectId);

	}

	@Override
	public List<SubjectDto> getAll() {
		return subjectRepository.findAll().stream().map(subject -> mapper.map(subject, SubjectDto.class)).toList();
	}

	@Override
	public SubjectDto getById(int subjectId) {
		Subject subject =subjectRepository.findById(subjectId)
				.orElseThrow(()-> new SubjectNotFoundException());
		System.out.println(subject);
				
		SubjectDto subjectDto= new SubjectDto();
		subjectDto.setSubjectId(subjectId);
		subjectDto.setSubjectName(subject.getSubjectName());
		subjectDto.setMode(subject.getMode());
		subjectDto.setFees(subject.getFees());
		return subjectDto;
		
	}

}
