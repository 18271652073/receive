package com.nbdeli.sender.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2019/2/27.
 */
@Component
@RabbitListener(queues = "lyhTest1")
public class Receiver2 {

    @RabbitHandler
    public void receiver(String msg) {
        System.out.println("Test1 receiver2:" + msg);
    }
}