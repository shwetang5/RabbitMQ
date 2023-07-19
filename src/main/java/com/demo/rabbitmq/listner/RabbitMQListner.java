package com.demo.rabbitmq.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.demo.rabbitmq.bean.ApplicantStatus;
import com.demo.rabbitmq.constants.RabbitMQConstants;

@Component
public class RabbitMQListner {
	
	@RabbitListener(queues = RabbitMQConstants.QUEUE)
	public void listner(ApplicantStatus applicantstatus) {
		
		System.out.println("listened message from queue :"+applicantstatus);
	}
}
