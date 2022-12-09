package com.BeachBums.BBitems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
         ## the username of the user I created in the MySQL workbench
		 spring.datasource.username=aaroe
		 ## the password for that user
		 spring.datasource.password=myPassword
		 ## "item" here refers to the name of the database I created
		 spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/item
		 ## the remaining lines should be the same for everyone
		 spring.jpa.hibernate.ddl-auto=update
		 spring.jpa.show-sql=true
		 spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
*/
@SpringBootApplication
public class BBitemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BBitemsApplication.class, args);
	}

}
