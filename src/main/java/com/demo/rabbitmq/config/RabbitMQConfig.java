package com.demo.rabbitmq.config;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.rabbitmq.constants.RabbitMQConstants;

@Configuration
public class RabbitMQConfig {
	
	@Bean
	public Queue getQueue(){
		return new Queue(RabbitMQConstants.QUEUE);
	}
	
	@Bean
	public TopicExchange getExchange() {
		return new TopicExchange(RabbitMQConstants.EXCHANGE);
	}
	
	@Bean
	public Binding topicQueueBinding(TopicExchange exchnge, Queue queue) {
		return BindingBuilder.bind(queue).to(exchnge).with(RabbitMQConstants.ROUTING_KEY);
	}
	
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}
