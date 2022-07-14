package com.devnam2k1.springboot;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 11:49 AM
 * Project Name:  springboot-kafka-real-world-project
 */
@Slf4j
public record WikimediaChangesHandler(
        KafkaTemplate<String, String> kafkaTemplate,
        String topic) implements EventHandler {


    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {
        log.info(String.format("event data -> %s", messageEvent.getData()));

        kafkaTemplate.send(topic, messageEvent.getData());
    }

    @Override
    public void onComment(String s) throws Exception {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
