package com.te.resume.entity;

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
@Entity
@Component
public class AchievementsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer achievementId;
	
	private String achievement;
	
//	@OneToOne
//	private Profile profile;
}
