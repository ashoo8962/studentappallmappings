package com.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;
import com.studentapp.model.Subject;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Integer> {

}
