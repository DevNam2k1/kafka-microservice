package com.devnam2k1.springboot;

import com.devnam2k1.springboot.entity.WikimediaData;
import com.devnam2k1.springboot.repository.WikimediaDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 2:38 PM
 * Project Name:  springboot-kafka-real-world-project
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDatabaseConsumer {

    private final WikimediaDataRepository dataRepository;

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "myGroup"
    )
    public void consume(String eventMessage){
        log.info(String.format("Event message recent -> %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaData);
    }

}
