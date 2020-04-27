package com.example.demo;

//import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		/*String url = "jdbc:postgresql://192.168.99.100:5432/customer";
		String user = "postgres";
		String pass = "root";
		Flyway flyway = Flyway.configure().dataSource(url,user,pass).load();
		flyway.migrate();*/
	}

}
