package com.dataloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataloader.model.PatientDetailsModel;
@Repository
public interface PatientRepository extends JpaRepository<PatientDetailsModel, Integer>{
	
	public PatientDetailsModel findByPatientName(String patientName);
	
	
	
	
	
	
	
}
