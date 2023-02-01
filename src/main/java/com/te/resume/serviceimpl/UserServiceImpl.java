package com.te.resume.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume.dto.UserDto;
import com.te.resume.entity.User;
import com.te.resume.repository.UserRepository;
import com.te.resume.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto register(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		userRepository.save(user);
		return userDto;
	}

}
