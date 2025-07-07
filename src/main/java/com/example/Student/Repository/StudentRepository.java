package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Student.Model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
}
