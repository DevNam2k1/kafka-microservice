package com.devnam2k1.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 11:33 AM
 * Project Name:  springboot-kafka-real-world-project
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name("wikimedia_recentchange")
                .build();
    }
}
