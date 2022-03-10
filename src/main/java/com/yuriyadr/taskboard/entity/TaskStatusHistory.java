package com.yuriyadr.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TaskStatusHistory")
public class TaskStatusHistory {

    @Id
    @SequenceGenerator(name = "taskStatusHistoryIdSeq", sequenceName = "task_status_history_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskStatusHistoryIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "task_status_id", nullable = false)
    private Long taskStatusId;

    @Column(name = "task_id", nullable = false)
    private Long taskId;

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

    public Long getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(Long taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}
