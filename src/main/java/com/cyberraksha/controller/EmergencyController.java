package com.cyberraksha.controller;

import com.cyberraksha.service.CyberContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmergencyController {
    private final CyberContentService contentService;
    public EmergencyController(CyberContentService contentService) { this.contentService = contentService; }
    @GetMapping("/emergency")
    public String emergency(Model model) { model.addAttribute("contacts", contentService.contacts()); return "emergency"; }
}
