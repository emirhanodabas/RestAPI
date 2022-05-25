package com.medipol.yazilimarac.RestAPIOrnek1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@RestController
	public static class Merhaba {
		@GetMapping("/merhaba")
		public String merhaba() {
			return "Merhaba";
		}
	}

}
