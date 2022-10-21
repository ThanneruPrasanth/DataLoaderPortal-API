package com.dataloader.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dataloader.common.PatientDTO;
import com.dataloader.model.PatientDetailsModel;
import com.dataloader.service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin
public class PatientDetailsController {
	@Autowired
	public PatientService service;

	@PostMapping("/savefile")
	public ResponseEntity<?> savePateint(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("hello");
		if (file.isEmpty()) {
			return new ResponseEntity<>("File is required", HttpStatus.NOT_ACCEPTABLE);
		} else {
			return new ResponseEntity<>(service.saveAllPatientModel(file), HttpStatus.ACCEPTED);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<?> savePatientDetails(@RequestBody PatientDetailsModel model) {
		return new ResponseEntity<>(service.saveOnePatientDetailsModel(model), HttpStatus.OK);
	}

	@GetMapping("/getDetails/searchText/{searchText}")
	public ResponseEntity<?> getPatientDetailsByName(@PathVariable("searchText") String patientName) {
		PatientDetailsModel response = service.getPatientWithPatinetName(patientName);
		System.out.println(response);
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}

	@PostMapping("/updateDetails")
	public ResponseEntity<?> updatePatientDetails(@RequestBody PatientDTO dtoData) {
		System.out.println("patient DTO " + dtoData);
		PatientDetailsModel dtoResponse = service.updatePatientDetails(dtoData);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

}
