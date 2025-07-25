package com.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.model.ClassRoom;
import com.studentapp.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
