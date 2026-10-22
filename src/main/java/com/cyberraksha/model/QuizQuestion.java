package com.cyberraksha.model;

import java.util.List;

public record QuizQuestion(String prompt, List<String> options, int correctIndex, String explanation) { }
