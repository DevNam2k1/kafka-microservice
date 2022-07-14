package com.devnam2k1.springboot.repository;

import com.devnam2k1.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 3:34 PM
 * Project Name:  springboot-kafka-real-world-project
 */
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
