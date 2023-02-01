package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.te.resume.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

	
}
