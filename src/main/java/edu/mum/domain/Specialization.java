package edu.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialization {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String specialization;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	
}
