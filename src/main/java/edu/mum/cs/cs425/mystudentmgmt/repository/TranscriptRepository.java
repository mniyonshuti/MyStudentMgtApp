package edu.mum.cs.cs425.mystudentmgmt.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.mystudentmgmt.model.Transcript;

public interface TranscriptRepository extends CrudRepository<Transcript, Long> {

}
