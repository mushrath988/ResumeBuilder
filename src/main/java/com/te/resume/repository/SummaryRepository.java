package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume.entity.Summary;
@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer> {

}
