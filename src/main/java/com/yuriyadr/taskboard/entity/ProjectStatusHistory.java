package com.yuriyadr.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ProjectStatusHistory")
public class ProjectStatusHistory {

    @Id
    @SequenceGenerator(name = "projectStatusHistoryIdSeq", sequenceName = "project_status_history_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectStatusHistoryIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "project_status_id", nullable = false)
    private Long projectStatusId;

    @Column(name = "project_id", nullable = false)
    private Long projectId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getProjectStatusId() {
        return projectStatusId;
    }

    public void setProjectStatusId(Long projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
