package com.pack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pack.model.Employee;
import com.pack.repository.EmployeeRepository;

@SpringBootApplication
public class DemojenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojenkinsApplication.class, args);
	}
	@Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args) -> {

            // Create users with BCrypt encoded password (user/user, admin/admin)
            Employee mnarios =new Employee("Mnari","Dhaker","bm@gm.com");
            Employee marroula =new Employee("Mnari","Miral","bmm@gm.com");
            Employee mouhamed =new Employee("Mnari","Mouhammed","b2m@gm.com");
            repository.save(mnarios);
            repository.save(marroula);
            repository.save(mouhamed);
            repository.findAll().forEach(e->{
            	System.out.println(e.toString());
            });
        };
    }

}
