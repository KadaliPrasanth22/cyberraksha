package com.cyberraksha.controller;

import com.cyberraksha.service.CyberContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final CyberContentService contentService;
    public HomeController(CyberContentService contentService) { this.contentService = contentService; }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("lessons", contentService.lessons().stream().limit(3).toList());
        return "index";
    }
}
