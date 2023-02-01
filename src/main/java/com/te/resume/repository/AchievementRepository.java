package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.te.resume.entity.AchievementsDetails;
@Repository
public interface AchievementRepository extends JpaRepository<AchievementsDetails, Integer>{



}
