package com.jk.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fanout {
    @Autowired
    RabbitTemplate rabbitTemplate;
    public String fanout(){
        rabbitTemplate.convertAndSend("fanoutExchange","","fanoutSend");
        return "ok";
    }
}
