package com.demo.rabbitmq.bean;

public class Applicant {
	
	private long applicantKey;
	private String mob;
	private String dob;
	private String firstName;
	private String lastName;
	public long getApplicantKey() {
		return applicantKey;
	}
	public void setApplicantKey(long applicantKey) {
		this.applicantKey = applicantKey;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Applicant [applicantKey=" + applicantKey + ", mob=" + mob + ", dob=" + dob + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}
