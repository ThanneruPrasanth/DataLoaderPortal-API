package com.dataloader.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dataloader.common.PatientDTO;
import com.dataloader.model.PatientDetailsModel;

@Service
public interface PatientService {

	public String saveAllPatientModel(MultipartFile file) throws IOException;

	public PatientDetailsModel saveOnePatientDetailsModel(PatientDetailsModel model);
	
	public PatientDetailsModel getPatientWithPatinetName(String patientName);

	public PatientDetailsModel updatePatientDetails(PatientDTO dtoData);
	

	
	
}
