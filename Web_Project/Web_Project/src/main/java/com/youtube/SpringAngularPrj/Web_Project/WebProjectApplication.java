package com.youtube.SpringAngularPrj.Web_Project;

import com.youtube.SpringAngularPrj.Web_Project.Model.Employee;
import com.youtube.SpringAngularPrj.Web_Project.new_repo.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication()
@ComponentScan("com.youtube.SpringAngularPrj.Web_Project")
@EntityScan("com.youtube.SpringAngularPrj.Web_Project.model")
//@EnableJpaRepositories("com.youtube.SpringAngularPrj.Web_Project.new_repo")
public class WebProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebProjectApplication.class, args);
	}
//	@Bean
//	CommandLineRunner init(EmployeeRepository employeeRepo) {
//		return args -> {
//			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//				Employee emp = new Employee(name, name+"@gmail.com");
//				employeeRepo.save(emp);
//			});
//		};
//	}
}
