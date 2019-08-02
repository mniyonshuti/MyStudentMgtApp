package edu.mum.cs.cs425.mystudentmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.mystudentmgmt.model.Classroom;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Long>{

}
