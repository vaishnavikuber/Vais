package com.tnsif.placement;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {
   
	private Long id;
	private String companyName;
	private String jobTitle;
	private LocalDate PlacementDate;
	private Long studentId;
	
	public Placement() {
		super();
	}
	
	public Placement(Long id, String companyName, String jobTitle, LocalDate placementDate, Long studentId) 
	{
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		PlacementDate = placementDate;
		this.studentId = studentId;
	}
	@Id

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getPlacementDate() {
		return PlacementDate;
	}

	public void setPlacementDate(LocalDate placementDate) {
		PlacementDate = placementDate;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", PlacementDate="
				+ PlacementDate + ", studentId=" + studentId + ", getId()=" + getId() + ", getCompanyName()="
				+ getCompanyName() + ", getJobTitle()=" + getJobTitle() + ", getPlacementDate()=" + getPlacementDate()
				+ ", getStudentId()=" + getStudentId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
