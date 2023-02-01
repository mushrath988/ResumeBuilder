package com.te.resume.entity;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillId;

	@ElementCollection
	List<String> frontEndTechnology;

	@ElementCollection
	List<String> backEndTechnology;

	@ElementCollection
	List<String> middlewareTechnology;

	@ElementCollection
	List<String> designPattern;

	@ElementCollection
	List<String> dataBases;

	@ElementCollection
	List<String> versionControlSystem;

	@ElementCollection
	List<String> aws;

	@ElementCollection
	List<String> sdlc;

	@ElementCollection
	List<String> developmentTools;

	@OneToOne
	@JoinColumn(name = "profile_Id")
	private Profile sprofile;
}
