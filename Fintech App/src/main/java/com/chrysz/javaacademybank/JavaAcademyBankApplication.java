package com.chrysz.javaacademybank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "The Simple Banking Application System",
				description = "Backend Rest APIs TJA Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Chrysz Ojo",
						email = "ojooluewabukunmic@gmail.com",
						url = "https://github.com/Chrysz-Ojo/Simple-Banking-Online-Application-System"
				),
				license = @License(
						name = "The Simple Banking Application System",
						url = "https://github.com/Chrysz-Ojo/Simple-Banking-Online-Application-System"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "The Simple Banking Application System Documentation",
				url = "https://github.com/Chrysz-Ojo/Simple-Banking-Online-Application-System"
		)

)
public class JavaAcademyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAcademyBankApplication.class, args);
	}

}
