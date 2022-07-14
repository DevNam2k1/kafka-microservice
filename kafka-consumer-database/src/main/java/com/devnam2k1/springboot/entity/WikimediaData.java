package com.devnam2k1.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 3:31 PM
 * Project Name:  springboot-kafka-real-world-project
 */
@Entity
@Getter
@Setter
@Table(name = "wikimedia_recent")
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String wikiEventData;
}
