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
@Entity
@ToString(exclude = "classRoom")
public class ClassRoom {

	@Column(length = 20)
	private String classRoomName;

	@Id
	@GeneratedValue(generator = "classRoom_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "classRoom_gen", sequenceName = "classRoom_seq", initialValue = 21)
	private Integer classRoomId;

	@OneToMany(mappedBy = "classRoom")
	private Set<Student> students;

	public ClassRoom(String classRoomName) {
		super();
		this.classRoomName = classRoomName;
	}

}
