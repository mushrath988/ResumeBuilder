package com.te.resume.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import com.te.resume.dto.EducationDto;

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
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String firstName;
	
	private String lastName;
	
	@ElementCollection
	private List<String> technology;
	
	private String totalExperience;
	
	private String relevantExperience;
	
	@OneToMany(mappedBy = "profile",cascade = CascadeType.ALL)
	private List<EducationDetails> educationDetails; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private Skills skills;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProjectDetails> projectDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Summary summary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AchievementsDetails achievementsDetails;
	
	@OneToMany(cascade =  CascadeType.ALL)
	private List<User> user;
}
