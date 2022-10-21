package com.dataloader.test.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.dataloader.model.PatientDetailsModel;
import com.dataloader.repository.PatientRepository;
import com.dataloader.service.PatientService;
import com.dataloader.service.impl.PatientServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class PatientServiceImplTest {

	@Mock
	PatientRepository patientRepository;

	@InjectMocks
	PatientService patientService = new PatientServiceImpl();

	PatientDetailsModel patientDetailsModel;

	@Before
	public void setUp() {
		patientDetailsModel = new PatientDetailsModel(333, "Balu", "AP", "11-6-1997", "balu@gmail.com", "987654321",
				321, "Fentanyi");
	}

	@Test
	public void saveOnePatientDetailsModelTest() {
		when(patientRepository.save(any())).thenReturn(patientDetailsModel);

		PatientDetailsModel response = patientRepository.save(patientDetailsModel);
		assertEquals(patientDetailsModel, response);

	}

	@Test
	public void getPatientWithPatinetNameTest() {
		String patientName = "Balu";
		when(patientRepository.findByPatientName(patientName)).thenReturn(patientDetailsModel);
		PatientDetailsModel response = patientService.getPatientWithPatinetName(patientName);
		assertEquals(patientDetailsModel, response);
	}
	
	@Test
	public void saveAllPatientModelTest() throws IOException {
		
		File file = new File("src/test/resources/input.csv");
		FileInputStream input = new FileInputStream(file);
		MultipartFile multipartFile = new MockMultipartFile("file",
		            file.getName(), "text/plain", input);
		
		when(patientRepository.saveAll(any())).thenReturn(new ArrayList<>());
		
		String response=patientService.saveAllPatientModel(multipartFile);
		assertEquals("PatientSavedSuccessfully", response);
	}
}
