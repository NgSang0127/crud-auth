package org.sang.ecommerce.admin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
	@GetMapping("/get")
	public String get(){
		return "GET METHOD";
	}

}

