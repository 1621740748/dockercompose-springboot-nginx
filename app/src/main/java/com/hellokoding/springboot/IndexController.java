package com.hellokoding.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(HttpServletRequest req, HttpServletResponse response,
			Model model) {
    	String s=req.getHeader("X-Forwarded-Host");
    	model.addAttribute("host", s);
        return "index";
    }
}
