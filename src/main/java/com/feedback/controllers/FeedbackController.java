package com.feedback.controllers;

import com.feedback.services.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("v1/feedback")
public class FeedbackController {

    private FeedbackService feedbackService;

    @GetMapping("/get-item")
    public String get(){
        return "item";
    }

}
