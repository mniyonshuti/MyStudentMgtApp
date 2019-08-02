package edu.mum.cs.cs425.mystudentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.mystudentmgmt.model.Classroom;
import edu.mum.cs.cs425.mystudentmgmt.model.Student;
import edu.mum.cs.cs425.mystudentmgmt.model.Transcript;
import edu.mum.cs.cs425.mystudentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.mystudentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.mystudentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;	
	@Autowired
	private ClassroomRepository classroomRepository2;	
	@Autowired
	private TranscriptRepository transcriptRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApp.class, args);
	}

	@SuppressWarnings("unused")
	@Override
	public void run(String... args) throws Exception {
		
		Classroom c = new Classroom("MCLaughlin building", "M105");
		Classroom c1 = new Classroom("MCLaughlin building", "M155");
				
		Transcript t = new Transcript("Bsc Computer Science");
		Transcript t1 = new Transcript("Msc Computer Science");
		Transcript t2 = new Transcript("Bsc Computer Science");
		Transcript t3 = new Transcript("Msc Computer Science");
		
		Student s = new Student("000-61-0002", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 5, 24));		
		Student s2 = new Student("000-61-0007", "Niyo", "Moses", "Allan", 4.33, LocalDate.of(2018, 11, 13));		
		Student s3 = new Student("000-61-0008", "Deus", "Assim", "Rulind", 2.45, LocalDate.of(2019, 4, 4));
		Student s4 = new Student("000-61-0009", "Dian", "Arin", "Loyt", 4.0, LocalDate.of(2019, 2, 9));
		
		s.setTranscript(t); s.setMyClassroom(c); c.addStudent(s);
		s2.setTranscript(t1); s2.setMyClassroom(c); c.addStudent(s2);
		s3.setTranscript(t2); s3.setMyClassroom(c1); c1.addStudent(s3);
		s4.setTranscript(t3); s4.setMyClassroom(c1);c1.addStudent(s4);
		
		Classroom class1 = saveClassroom(c);
		Classroom class2 = saveClassroom(c1);
		
		Student stud = saveStudent(s);
		Student stud2 = saveStudent(s2);
		Student stud3 = saveStudent(s3);
		Student stud4 = saveStudent(s4);
	}
	
	public Student saveStudent(Student s) {
		return this.studentRepository.save(s);
		
	}
	
	public Classroom saveClassroom(Classroom c) {
		return this.classroomRepository2.save(c);
	}
	
	public Transcript saveTranscript(Transcript t) {
		return this.transcriptRepository.save(t);
		
	}	
	
}
