package com.edulab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig 
{
	@Bean
	public Docket apiDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				   .apis(RequestHandlerSelectors.basePackage("com.edulab"))
				   .paths(regex("/rest.*"))
				   .build()
				   .apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() 
	{
		List<VendorExtension> extension=new ArrayList<>();
		
		ApiInfo info=new ApiInfo(
				"Spring Boot Swagger Information",
				"Spi",
				"1.2.",
				"ouo",
				new Contact("mmm", "mmmm", "llll"),
				"aaa",
				"aaaa",
				extension
				);
			return info;	
	}
}
