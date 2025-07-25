package com.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface IClassRoomRepository extends JpaRepository<Student, Integer> {

}
