package com.youtube.SpringAngularPrj.Web_Project.Controller;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee_Salary;
import com.youtube.SpringAngularPrj.Web_Project.Model.Employee;
import com.youtube.SpringAngularPrj.Web_Project.new_repo.EmployeeRepository;
import com.youtube.SpringAngularPrj.Web_Project.Exception.ResourceNotFoundException;
//import com.youtube.SpringAngularPrj.Web_Project.repository.EmployeeRepository;
import com.youtube.SpringAngularPrj.Web_Project.new_repo.Emplpyeepayrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @Autowired
    private Emplpyeepayrepo emppayrepo;

    @GetMapping("/allemployees")
    public List<Employee> getAllEmployees(){
        return empRepository.findAll();
    }

    @PostMapping("/add")
    public String addemp(@RequestBody Employee emp){

        empRepository.save(emp);
        return "Hi "+emp.getName();
    }

    @DeleteMapping("/delete_emp/{id}")
    @Transactional
    public int delete_emp(@PathVariable int id){
        return empRepository.deleteuser(id);
    }

    @GetMapping("/search/{id}")
    public Employee search(@PathVariable int id){
        try {
            return empRepository.searchuser(id);
        }
        catch(ResourceNotFoundException res){
            throw new ResourceNotFoundException("Employee not found");
        }
    }

    @GetMapping("/salary")
    public List<Employee_Salary> getEmp_salary(){
        return emppayrepo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        empRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/alter")
    public List<Employee> alter_Emp(long id){

        return this.getAllEmployees();
    }

}
