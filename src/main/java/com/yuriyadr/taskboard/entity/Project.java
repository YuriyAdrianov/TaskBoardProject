package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @SequenceGenerator(name = "projectIdSeq", sequenceName = "project_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "varchar(500)", nullable = true)
    private String description;

    @Column(name = "project_status_history_id", nullable = false)
    private Long projectStatusHistoryId;

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

    public Long getProjectStatusHistoryId() {
        return projectStatusHistoryId;
    }

    public void setProjectStatusHistoryId(Long projectStatusHistoryId) {
        this.projectStatusHistoryId = projectStatusHistoryId;
    }
}
