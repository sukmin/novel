package com.ilovebambi.novel.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NovelController {

	@GetMapping({"/", "/index.html", "/home"})
	public String getHome(Model model) {
		return "/index.html";
	}

}
