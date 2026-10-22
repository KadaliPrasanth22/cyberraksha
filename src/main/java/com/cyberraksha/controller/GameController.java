package com.cyberraksha.controller;

import com.cyberraksha.service.CyberContentService;
import jakarta.servlet.http.HttpSession;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    private final CyberContentService contentService;
    public GameController(CyberContentService contentService) { this.contentService = contentService; }

    @GetMapping("/games")
    public String games(Model model) { model.addAttribute("questions", contentService.questions()); return "games"; }

    @PostMapping("/games/submit")
    public String submit(@RequestParam Map<String, String> answers, Model model, HttpSession session) {
        var questions = contentService.questions();
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            String selected = answers.get("answers[" + i + "]");
            if (selected != null && selected.equals(String.valueOf(questions.get(i).correctIndex()))) score++;
        }
        model.addAttribute("questions", questions);
        model.addAttribute("score", score);
        model.addAttribute("total", questions.size());
        model.addAttribute("submitted", true);
        return "games";
    }
}
