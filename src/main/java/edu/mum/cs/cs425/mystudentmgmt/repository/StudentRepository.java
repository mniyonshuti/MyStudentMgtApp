package edu.mum.cs.cs425.mystudentmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.mystudentmgmt.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
