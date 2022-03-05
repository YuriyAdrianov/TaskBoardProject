package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "ProjectStatus")
public class ProjectStatus {

    @Id
    @SequenceGenerator(name = "projectStatusIdSeq", sequenceName = "project_status_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectStatusIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "varchar(500)", nullable = true)
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
