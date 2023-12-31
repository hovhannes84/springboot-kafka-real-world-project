package net.javaguides.springboot.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table (name = "wikimedia_recentchange")
@Data
public class WikimediaData {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Lob
    private String wikiEventData;

}
