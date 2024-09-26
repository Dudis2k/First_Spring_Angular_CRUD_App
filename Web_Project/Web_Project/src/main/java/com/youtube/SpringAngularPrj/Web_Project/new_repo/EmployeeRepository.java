package com.youtube.SpringAngularPrj.Web_Project.new_repo;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee_Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Modifying(clearAutomatically = true)
    @Query("Delete FROM Employee where id = ?1")
    int deleteuser(int id);

    @Query("Select e from Employee e where e.id =?1")
    Employee searchuser(int id);

    @Query(nativeQuery = true,value="SELECT e.id, e.name, e.salary FROM Employee_Salary e")
    List<Employee_Salary> pay();
}
