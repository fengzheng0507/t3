package com.atguigu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
public class testDemos {

    @Autowired
    KafkaTemplate kafkaTemplate;

    public static void main(String[] args) {
        kafkaTemplate.send()
    }
}
