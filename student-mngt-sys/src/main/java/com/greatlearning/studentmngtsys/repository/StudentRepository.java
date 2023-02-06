package com.greatlearning.studentmngtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmngtsys.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
