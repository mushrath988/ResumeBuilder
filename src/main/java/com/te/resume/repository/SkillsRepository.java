package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume.entity.Skills;
@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {

}
