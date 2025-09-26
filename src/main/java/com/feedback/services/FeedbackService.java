package com.feedback.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class FeedbackService {

    public void add() {
        log.info("Adding..");
    }

}
