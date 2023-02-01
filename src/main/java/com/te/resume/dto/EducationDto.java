package com.te.resume.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EducationDto {
	private String education;
	private String specialization;
	private String univercity;
	private Integer passoutYear;
	private Double percentage;
	

}
