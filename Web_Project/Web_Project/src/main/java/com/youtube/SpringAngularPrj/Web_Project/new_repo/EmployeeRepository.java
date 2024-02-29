package com.youtube.SpringAngularPrj.Web_Project.new_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Modifying(clearAutomatically = true)
    @Query("Delete FROM Employee where id = ?1")
    int deleteuser(int id);

    @Query("Select e.name from Employee e where e.id =?1")
    String searchuser(int id);
}
