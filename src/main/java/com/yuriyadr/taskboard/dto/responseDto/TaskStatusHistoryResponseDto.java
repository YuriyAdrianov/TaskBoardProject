package com.yuriyadr.taskboard.dto.responseDto;

import java.time.LocalDateTime;

public class TaskStatusHistoryResponseDto {

    private Long id;

    private LocalDateTime timestamp;

    private TaskStatusResponseDto taskStatus;

    private String taskName;

    public TaskStatusHistoryResponseDto(Long id,
                                        LocalDateTime timestamp,
                                        TaskStatusResponseDto taskStatus,
                                        String taskName) {
        this.id = id;
        this.timestamp = timestamp;
        this.taskStatus = taskStatus;
        this.taskName = taskName;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public TaskStatusResponseDto getTaskStatus() {
        return taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }
}
