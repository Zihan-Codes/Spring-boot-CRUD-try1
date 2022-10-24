package com.zag.zagschool;

import com.zag.zagschool.model.Employee;
import com.zag.zagschool.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZagschoolApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ZagschoolApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Fadate");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);

//		Employee employee1 = new Employee();
//		employee1.setFirstName("Dasun");
//		employee1.setLastName("Mangp");
//		employee1.setEmailId("mango@gmail.com");
//		employeeRepository.save(employee1);
	}
}
