package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "Task")
public class Task {

    @Id
    @SequenceGenerator(name = "taskIdSeq", sequenceName = "task_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "board_id", nullable = false)
    private Long boardId;

    @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "varchar(500)", nullable = true)
    private String description;

    @Column(name = "author_worker_id", nullable = false)
    private Long authorWorkerId;

    @Column(name = "executive_worker_id", nullable = false)
    private Long executiveWorkerId;

    @Column(name = "release_id", nullable = false)
    private Long releaseId;

    @Column(name = "task_status_history_id", nullable = false)
    private Long taskStatusHistoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
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

    public Long getAuthorWorkerId() {
        return authorWorkerId;
    }

    public void setAuthorWorkerId(Long authorWorkerId) {
        this.authorWorkerId = authorWorkerId;
    }

    public Long getExecutiveWorkerId() {
        return executiveWorkerId;
    }

    public void setExecutiveWorkerId(Long executiveWorkerId) {
        this.executiveWorkerId = executiveWorkerId;
    }

    public Long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Long releaseId) {
        this.releaseId = releaseId;
    }

    public Long getTaskStatusHistoryId() {
        return taskStatusHistoryId;
    }

    public void setTaskStatusHistoryId(Long taskStatusHistoryId) {
        this.taskStatusHistoryId = taskStatusHistoryId;
    }
}
