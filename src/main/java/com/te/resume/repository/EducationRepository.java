package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume.entity.EducationDetails;
@Repository
public interface EducationRepository extends JpaRepository<EducationDetails, Integer>{

}
