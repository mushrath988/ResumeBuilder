package com.te.resume.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
@Entity
public class EducationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;

	private String education;

	private String specialization;

	private String univercity;

	private Integer passoutYear;

	private Double percentage;

	@ManyToOne
//	@JoinColumn(name="education_details")
	private Profile profile;
}
