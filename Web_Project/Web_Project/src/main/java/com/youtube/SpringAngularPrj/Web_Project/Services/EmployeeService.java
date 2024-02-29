package com.youtube.SpringAngularPrj.Web_Project.Services;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee;
import com.youtube.SpringAngularPrj.Web_Project.new_repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    public final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee Addemployee(Employee emp){
        emp.setId(Long.parseLong(UUID.randomUUID().toString()));
        return employeeRepository.save(emp);
    }

    public List<Employee> findAllEmployees(Employee emp){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }

//    public Employee FindEmployeebyid(long id){
//        return employeeRepository.findEmployeebyid(id).orElseThrow(()-> new UserNotFoundException("User not found"));
//    }
}
