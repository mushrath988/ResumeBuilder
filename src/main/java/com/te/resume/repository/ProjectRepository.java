package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume.entity.ProjectDetails;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectDetails, Integer>{

}
