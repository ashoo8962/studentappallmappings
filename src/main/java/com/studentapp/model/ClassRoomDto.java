package com.studentapp.model;

import java.util.Set;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "classRoom")
public class ClassRoomDto {

	public ClassRoomDto(String classRoomName) {
		super();
		this.classRoomName = classRoomName;
	}

	private String classRoomName;
	private Integer classRoomId;
	private Set<Student> students;

}
