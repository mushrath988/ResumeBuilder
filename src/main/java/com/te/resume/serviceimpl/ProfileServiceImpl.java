package com.te.resume.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.te.resume.dto.AchievementDto;
import com.te.resume.dto.EducationDto;
import com.te.resume.dto.ProfileDto;
import com.te.resume.dto.ProjectDto;
import com.te.resume.dto.SkillsDto;
import com.te.resume.dto.SummaryDto;
import com.te.resume.entity.AchievementsDetails;
import com.te.resume.entity.EducationDetails;
import com.te.resume.entity.Profile;
import com.te.resume.entity.ProjectDetails;
import com.te.resume.entity.Skills;
import com.te.resume.entity.Summary;
import com.te.resume.repository.AchievementRepository;
import com.te.resume.repository.EducationRepository;
import com.te.resume.repository.ProfileRepository;
import com.te.resume.repository.ProjectRepository;
import com.te.resume.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private AchievementRepository achievementRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public ProfileDto addProfile(ProfileDto profileDto) {
		Profile profile = new Profile();
		BeanUtils.copyProperties(profileDto, profile);

		Summary suList = new Summary();
		BeanUtils.copyProperties(profileDto.getSummaryDetails(), suList);
		profile.setSummary(suList);

		// Achievements
		AchievementsDetails achievementsDetails = new AchievementsDetails();
		BeanUtils.copyProperties(profileDto.getAchievementsDto(), achievementsDetails);
		profile.setAchievementsDetails(achievementsDetails);

		// Education Details
		List<EducationDto> educationDtos = profileDto.getEducationDtos();
		List<EducationDetails> eList = new ArrayList<>();
		educationDtos.forEach(e -> {
			EducationDetails educationDetails = new EducationDetails();
			BeanUtils.copyProperties(e, educationDetails);
			educationDetails.setProfile(profile);
			eList.add(educationDetails);
		});
		profile.setEducationDetails(eList);

		// Project Details
		List<ProjectDto> projectDtos = profileDto.getProjectDto();
		List<ProjectDetails> prList = new ArrayList();
		projectDtos.forEach(e -> {
			ProjectDetails projectDetails = new ProjectDetails();
			BeanUtils.copyProperties(e, projectDetails);
			prList.add(projectDetails);
			//projectRepository.save(projectDetails);
		});
		profile.setProjectDetails(prList);

		// Skills
		Skills skillList = new Skills();
		BeanUtils.copyProperties(profileDto.getSkills(), skillList);
		profile.setSkills(skillList);

		// Summary
		Summary summary = new Summary();
		BeanUtils.copyProperties(profileDto.getSummaryDetails(), summary);
		profile.setSummary(summary);
		profileRepository.save(profile);
		return profileDto;

	}

	@Override
	public ProfileDto getById(Integer id) {
		Profile profile = profileRepository.findById(id).get();
		ProfileDto profileDto = new ProfileDto();
		BeanUtils.copyProperties(profile, profileDto);

		// Achievements
		AchievementsDetails achievementsDetails = new AchievementsDetails();
		AchievementDto achDto = new AchievementDto();
		BeanUtils.copyProperties(profile.getAchievementsDetails(), achDto);
		profileDto.setAchievementsDto(achDto);

		// Education
		List<EducationDetails> education = profile.getEducationDetails();
		education.forEach(e -> {
			EducationDto educationDto = new EducationDto();
			BeanUtils.copyProperties(e, educationDto);

		});
		profile.setEducationDetails(education);

		// Project Details
		List<ProjectDetails> projectDtos = profile.getProjectDetails();
		projectDtos.forEach(e -> {
			ProjectDto projectDto = new ProjectDto();
			BeanUtils.copyProperties(e, projectDto);
		});
		profile.setProjectDetails(projectDtos);

		Skills skills = new Skills();
		SkillsDto skillsDto = new SkillsDto();
		BeanUtils.copyProperties(profile.getSkills(), skills);
		profileDto.setSkills(skillsDto);

		// Summary
		Summary summary = new Summary();
		SummaryDto summaryDto = new SummaryDto();
		BeanUtils.copyProperties(profile.getSummary(), summary);
		profileDto.setSummaryDetails(summaryDto);
		
		return profileDto;
	}

	@Override
	public ProfileDto update(ProfileDto profileDto ,Integer id) {
		Profile profile=profileRepository.findById(id).get();
		BeanUtils.copyProperties(profileDto,profile);
		profileRepository.save(profile);
		return profileDto;
		
		
	}
}
