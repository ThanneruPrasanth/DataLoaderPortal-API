package com.dataloader.common;

public class PatientDTO {
	
	private int patientId;
	private String patientName;
	private String address;
	private String emailId;
	private String phoneNumber;
	private String dateOfBirth;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public PatientDTO(String patientName, String address, String emailId, String phoneNumber, String dateOfBirth,
			int patientId) {
		super();
		this.patientName = patientName;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", address=" + address + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + ", patientId=" + patientId + "]";
	}
	public PatientDTO() {
		super();
	} 
	
	
	

}
