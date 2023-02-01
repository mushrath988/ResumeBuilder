package com.te.resume.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillsDto  {
	List<String> frontEndTechnology;

	List<String> backEndTechnology;

	List<String> middlewareTechnology;

	List<String> designPattern;

	List<String> dataBases;

	List<String> versionControlSystem;

	List<String> aws;

	List<String> sdlc;

	List<String> developmentTools;
}
