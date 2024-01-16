package com.projects.RestAPI.repository;

import com.projects.RestAPI.entity.Student;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student, Integer> {
}
