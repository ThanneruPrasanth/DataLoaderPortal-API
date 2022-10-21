package com.dataloader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PatientDetailsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String patientAddress;
	private String patientDateOfBirth;
	private String patientEmail;
	private String patientContactNumber;
	private double patientDrugId;
	private String patientDrugName;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}
	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientContactNumber() {
		return patientContactNumber;
	}
	public void setPatientContactNumber(String patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}
	public double getPatientDrugId() {
		return patientDrugId;
	}
	public void setPatientDrugId(double patientDrugId) {
		this.patientDrugId = patientDrugId;
	}
	public String getPatientDrugName() {
		return patientDrugName;
	}
	public void setPatientDrugName(String patientDrugName) {
		this.patientDrugName = patientDrugName;
	}
	@Override
	public String toString() {
		return "PatientDetailsModel [patientId=" + patientId + ", patientName=" + patientName + ", patientAddress="
				+ patientAddress + ", patientDateOfBirth=" + patientDateOfBirth + ", patientEmail=" + patientEmail
				+ ", patientContactNumber=" + patientContactNumber + ", patientDrugId=" + patientDrugId
				+ ", patientDrugName=" + patientDrugName + "]";
	}
	public PatientDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDetailsModel(int patientId, String patientName, String patientAddress, String patientDateOfBirth,
			String patientEmail, String patientContactNumber, double patientDrugId, String patientDrugName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientDateOfBirth = patientDateOfBirth;
		this.patientEmail = patientEmail;
		this.patientContactNumber = patientContactNumber;
		this.patientDrugId = patientDrugId;
		this.patientDrugName = patientDrugName;
	}
	
	
	
	

}
