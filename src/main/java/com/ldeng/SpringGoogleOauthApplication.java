package com.ldeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringGoogleOauthApplication {

	UserInfoRestTemplateCustomizer customOauth2Template = new CustomOAuth2RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(SpringGoogleOauthApplication.class, args);
	}
}

