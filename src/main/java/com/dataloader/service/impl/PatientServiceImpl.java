package com.dataloader.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dataloader.common.PatientDTO;
import com.dataloader.model.PatientDetailsModel;
import com.dataloader.repository.PatientRepository;
import com.dataloader.service.PatientService;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public String saveAllPatientModel(MultipartFile file) throws IOException {
		
		

            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));) {

                          CsvToBean<PatientDetailsModel> csvToBean = new CsvToBeanBuilder(reader).withType(PatientDetailsModel.class)
                      .withIgnoreLeadingWhiteSpace(true)
                        .build();

               List<PatientDetailsModel> users = csvToBean.parse();
               patientRepository.saveAll(users);
               return "PatientSavedSuccessfully";
            }
	}

	@Override
	public PatientDetailsModel saveOnePatientDetailsModel(PatientDetailsModel model) {
		
		return patientRepository.save(model);
	}

	@Override
	public PatientDetailsModel getPatientWithPatinetName(String patientName) {

		
		return patientRepository.findByPatientName(patientName);
	}

	
	@Override
	public PatientDetailsModel updatePatientDetails(PatientDTO dtoData) {
		PatientDetailsModel existingDetails = patientRepository.findByPatientName(dtoData.getPatientName());
		existingDetails.setPatientAddress(dtoData.getAddress());
		existingDetails.setPatientDateOfBirth(dtoData.getDateOfBirth());
		existingDetails.setPatientEmail(dtoData.getEmailId());
		existingDetails.setPatientContactNumber(dtoData.getPhoneNumber());
		PatientDetailsModel patientDetails = patientRepository.save(existingDetails);
				
		
		return patientDetails;
	}

//	
	
}
