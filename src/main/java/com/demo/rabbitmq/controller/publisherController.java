package com.demo.rabbitmq.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rabbitmq.bean.Applicant;
import com.demo.rabbitmq.bean.ApplicantStatus;
import com.demo.rabbitmq.constants.RabbitMQConstants;

@RestController
public class publisherController {
	
	@Autowired
    private RabbitTemplate template;

    @PostMapping("/publishMessage/{applicantKey}")
    public String bookOrder(@RequestBody Applicant applicant, @PathVariable long applicantKey) {
        ApplicantStatus applicantStatus =new ApplicantStatus();
        applicantStatus.setApplicant(applicant);
        applicantStatus.setIsApplicantPresent("ApplicantPresent");
        applicantStatus.setIsApplicantUpdated("Applicant is updated");
        template.convertAndSend(RabbitMQConstants.EXCHANGE, RabbitMQConstants.ROUTING_KEY, applicantStatus);
        return "message publish successfully !!";
    }
}


