package com.jk.rabbitmq;

import com.jk.pojo.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Send {
    @Autowired
    RabbitTemplate rabbitTemplate;
    public void send(){
        rabbitTemplate.convertAndSend("string","1to1");
    }
    public void Sender(String message){
        rabbitTemplate.convertAndSend("ontoMany",message);
    }
    public void SendUser(){
        User user = new User();
        user.setUserName("ly");
        user.setPassword("aa");
        rabbitTemplate.convertAndSend("user",user);
    }
}
