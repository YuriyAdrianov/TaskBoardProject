package com.yuriyadr.taskboard.dto.responseDto;

import java.time.LocalDateTime;

public class TaskStatusHistoryResponseDto {

    private LocalDateTime timestamp;

    private TaskStatusResponseDto taskStatus;

    private String taskName;

    public TaskStatusHistoryResponseDto(LocalDateTime timestamp, TaskStatusResponseDto taskStatus, String taskName) {
        this.timestamp = timestamp;
        this.taskStatus = taskStatus;
        this.taskName = taskName;
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
