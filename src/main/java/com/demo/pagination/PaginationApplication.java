package com.demo.pagination;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.demo.pagination", "com.demo.api.rest.controller", "com.demo.service", "com.demo.service.impl" })
@EntityScan(basePackages = "com.demo.domain.entity")
@EnableJpaRepositories(basePackages = "com.demo.dao.repository")
@EnableSwagger2
public class PaginationApplication {

	public static void main(String[] args) {

		SpringApplication.run(PaginationApplication.class, args);

	}
	
	
	@Bean
	public CorsFilter corsFilter() {
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

	    // Allow anyone and anything access (for now)
	    CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
	   

	    source.registerCorsConfiguration("/swagger-ui/", config);
	    source.registerCorsConfiguration("/api/atome/*", config);
	    return new CorsFilter(source);
	}

	// Swagger Config
	@Bean
	public Docket demoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.demo.api.rest.controller"))
				.build()
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		return new ApiInfo(
		"Spring Boot REST API (demo purpose)",
		"",//"Spring Boot REST API for demo purpose",
		"v1.0",
		"", //"Terms of service",
		new Contact("Rami OUAOU", "http://ramiouaou.fr/about", "rami.waw@gmail.com"),
		"",//"Apache License Version 2.0",
		"",//"https://www.apache.org/licenses/LICENSE-2.0",
		new ArrayList<>()
		);
	}
}
