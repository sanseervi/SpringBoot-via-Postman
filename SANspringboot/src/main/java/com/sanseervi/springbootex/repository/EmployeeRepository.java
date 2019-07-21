package com.sanseervi.springbootex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanseervi.springbootex.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}