package edu.mum.cs.cs425.mystudentmgmt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentID;
	@NonNull
	@Column(nullable = false)
	private String studentNumber;
	@NonNull
	private String firstName;
	private String middleName;
	@NonNull
	private String lastName;
	private Double cgpa;
	private LocalDate dateOfEnrollment;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Transcipt_ID_FK" )
	private Transcript transcript;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "classroom_ID_FK")
	private Classroom myClassroom;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentID, String studentNumber, String firstName, String middleName, String lastName,
			Double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentID = studentID;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	public Student(String studentNumber, String firstName, String middleName, String lastName,
			Double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript transcrip) {
		this.transcript = transcrip;
	}

	public Classroom getMyClassroom() {
		return myClassroom;
	}

	public void setMyClassroom(Classroom myClassroom) {
		this.myClassroom = myClassroom;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}
	
	

}
