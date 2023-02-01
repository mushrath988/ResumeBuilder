package com.te.resume.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDto {
	List<String> FrontEndTechnology;
	List<String> BackEndTchnology;
	List<String> builderPattern;
	List<String> dataBase;
	List<String> developmentTools;
	private String duration;
	private Integer teamSize;
	private String description;
	private String rolesAndResponsibilities;

}
