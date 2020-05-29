package com.star.sud.restservices.basicauth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthContoller {

	@GetMapping("/basicauth")
	public BasicAuth validateBean() {
		return new BasicAuth("Your are successfully logged in");
	}

}
