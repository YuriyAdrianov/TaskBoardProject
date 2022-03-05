package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "Worker")
public class Worker {

    @Id
    @SequenceGenerator(name = "workerIdSeq", sequenceName = "worker_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workerIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
    private String name;

    @Column(name = "activity", columnDefinition="boolean default true", nullable = false)
    private Boolean activity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActivity() {
        return activity;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }
}
