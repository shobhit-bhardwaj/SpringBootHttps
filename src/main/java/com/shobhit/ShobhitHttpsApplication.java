package com.shobhit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShobhitHttpsApplication {
	/**
	 * 
	 * Key Store Generation
	 * keytool -genkey -alias spring-boot-https -storetype JKS -keyalg RSA -keysize 2048 -validity 2000 -keystore spring-boot-https.jks
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShobhitHttpsApplication.class, args);
	}
}