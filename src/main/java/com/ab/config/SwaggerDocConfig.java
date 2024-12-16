package com.ab.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerDocConfig {
	
	@Bean
	public GroupedOpenApi createDocket() {
//		return new GroupedOpenApi.builder().group("ActorAPI").pathToMatch("/actor/**").build();
		return GroupedOpenApi.builder().group("ActorAPI").pathsToMatch("/actor/**").build();
	}
	
//	private ApiInfo getApiInfo() {
//		Contact contact=new Contact("Abhi", "https://google.com", "dodeabhi@gmailcom");
//		return new ApiInfo("ActorAPI", "Give info of Actor", "3.4Relese", "https://google.com", contact, "GnuPublic", "",Collections.emptyList());
//	}
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(
								new Info().title("ActorAPI")
										  .description("Give info of Actor")
										  .version("3.34Relese")
										  .termsOfService("https://google.com")
										  .contact(new Contact().name("Abhijeet").email("dodeabhi@gmail.com").url("https://google.com")));
	}
}
