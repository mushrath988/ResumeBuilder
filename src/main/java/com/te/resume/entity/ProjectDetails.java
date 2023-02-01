package com.te.resume.entity;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class ProjectDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;

	@ElementCollection
	List<String> FrontEndTechnology;

	@ElementCollection
	List<String> BackEndTchnology;

	@ElementCollection
	List<String> builderPattern;

	@ElementCollection
	List<String> dataBase;

	@ElementCollection
	List<String> developmentTools;

	private String duration;

	private Integer teamSize;

	private String description;

	private String rolesAndResponsibilities;

}
