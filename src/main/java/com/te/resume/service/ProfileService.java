package com.te.resume.service;

import com.te.resume.dto.ProfileDto;

public interface ProfileService {

	ProfileDto addProfile(ProfileDto profileDto);

	ProfileDto getById(Integer id);

	ProfileDto update(ProfileDto profileDto,Integer id);


}
