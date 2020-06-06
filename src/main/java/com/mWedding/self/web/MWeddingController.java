package com.mWedding.self.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MWeddingController {
	@RequestMapping("/heejanie")
	public String welcome() { 
		return "heejanie"; 
	}

}
