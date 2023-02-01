package com.te.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
