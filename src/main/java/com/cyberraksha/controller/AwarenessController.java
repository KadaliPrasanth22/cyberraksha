package com.cyberraksha.controller;

import com.cyberraksha.service.CyberContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AwarenessController {
    private final CyberContentService contentService;
    public AwarenessController(CyberContentService contentService) { this.contentService = contentService; }

    @GetMapping("/learn")
    public String lessons(Model model) { model.addAttribute("lessons", contentService.lessons()); return "learn"; }

    @GetMapping("/learn/{slug}")
    public String lesson(@PathVariable String slug, Model model) {
        var lesson = contentService.lessons().stream().filter(item -> item.slug().equals(slug)).findFirst().orElse(null);
        if (lesson == null) return "redirect:/learn";
        model.addAttribute("lesson", lesson);
        return "lesson-detail";
    }
}
