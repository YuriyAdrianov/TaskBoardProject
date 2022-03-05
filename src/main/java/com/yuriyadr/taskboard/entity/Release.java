package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "Release")
public class Release {

    @Id
    @SequenceGenerator(name = "releaseIdSeq", sequenceName = "release_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "releaseIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

*
}
