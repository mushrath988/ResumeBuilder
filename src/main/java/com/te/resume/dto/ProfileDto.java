package com.te.resume.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileDto {
	private String firstName;
	private String lastName;
	private String totalExperience;
	private String relevantExperience;
	private SkillsDto skills;
	private SummaryDto summaryDetails;
	private List<String> technology;
	private List<EducationDto> educationDtos;
	private List<ProjectDto> projectDto;
	private AchievementDto achievementsDto;
	private String userName;
	 
}
