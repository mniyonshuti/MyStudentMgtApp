package edu.mum.cs.cs425.mystudentmgmt.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomID;	
	private String buildingName;
	private String roomNumber;
	@OneToMany(targetEntity = Student.class, mappedBy = "myClassroom", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Student> students;
	
	public Classroom() {
		super();
	}

	public Classroom(Long classroomID, String buildingName, String roomNumber) {
		super();
		this.classroomID = classroomID;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		students = new LinkedList<>();
	}
	
	public Classroom(String buildingName, String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		students = new LinkedList<>();
	}

	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Classroom [classroomID=" + classroomID + ", buildingName=" + buildingName + ", roomNumber=" + roomNumber
				+ "]";
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	
	
	
}
