package com.tzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SSMApplication {

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(args));
//		String[] arg = new String[1];
//		arg[0] = "--server.port=8802";
//		SpringApplication.run(SSMApplication.class, arg);
		SpringApplication.run(SSMApplication.class);
	}

}
