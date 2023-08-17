package com.skt.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skt.ems.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}
