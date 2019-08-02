package edu.mum.cs.cs425.mystudentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transcripts")
public class Transcript {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transcriptId;
	private String degreeTittle;
	
	
	public Transcript() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transcript(Long transcriptId, String degreeTittle) {
		super();
		this.transcriptId = transcriptId;
		this.degreeTittle = degreeTittle;
	}

	public Transcript(String degreeTittle) {
		super();
		this.degreeTittle = degreeTittle;
	}

	public Long getTranscriptId() {
		return transcriptId;
	}


	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}


	public String getDegreeTittle() {
		return degreeTittle;
	}


	public void setDegreeTittle(String degreeTittle) {
		this.degreeTittle = degreeTittle;
	}


	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTittle=" + degreeTittle + "]";
	}
	
	
	
}
