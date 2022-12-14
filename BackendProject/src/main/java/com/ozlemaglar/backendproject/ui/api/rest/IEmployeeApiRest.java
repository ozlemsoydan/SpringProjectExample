package com.ozlemaglar.backendproject.ui.api.rest;

import com.ozlemaglar.backendproject.business.dto.EmployeeDto;
import com.ozlemaglar.backendproject.error.ApiResult;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IEmployeeApiRest {


    public String getRoot();

    //save
    public ResponseEntity<ApiResult>  createEmployee(EmployeeDto employeeDto);

    //list
    public ResponseEntity<List<EmployeeDto>>  getAllEmployees();

    //find
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id);

    //update
    public ResponseEntity<EmployeeDto>  updateEmployee(Long id, EmployeeDto employeeDto);

    //delete
    public ResponseEntity<Map<String,Boolean>>  deleteEmployee(Long id);
}

