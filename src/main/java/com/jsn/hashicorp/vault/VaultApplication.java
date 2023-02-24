package com.jsn.hashicorp.vault;

import org.hibernate.annotations.SQLInsert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SQLInsert(sql = "INSERT INTO employee(empId,empName) values(\"emp001\",\"emp1\")")
public class VaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultApplication.class, args);
	}

}
