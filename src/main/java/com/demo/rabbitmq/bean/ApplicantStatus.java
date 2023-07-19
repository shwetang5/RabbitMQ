package com.demo.rabbitmq.bean;



public class ApplicantStatus {
	
	private Applicant applicant;
	private String isApplicantPresent;
	private String isApplicantUpdated;
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public String getIsApplicantPresent() {
		return isApplicantPresent;
	}
	public void setIsApplicantPresent(String isApplicantPresent) {
		this.isApplicantPresent = isApplicantPresent;
	}
	public String getIsApplicantUpdated() {
		return isApplicantUpdated;
	}
	public void setIsApplicantUpdated(String isApplicantUpdated) {
		this.isApplicantUpdated = isApplicantUpdated;
	}
	@Override
	public String toString() {
		return "ApplicantStatus [applicant=" + applicant + ", isApplicantPresent=" + isApplicantPresent
				+ ", isApplicantUpdated=" + isApplicantUpdated + "]";
	}
	
	

}
