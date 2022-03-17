package com.yuriyadr.taskboard.dto.requestDto;

import java.time.LocalDateTime;

public class TaskStatusHistoryRequestDto {

    private LocalDateTime timestamp;

    private TaskStatusRequestDto taskStatus;

    private String taskName;

    public TaskStatusHistoryRequestDto(LocalDateTime timestamp,
                                       TaskStatusRequestDto taskStatus,
                                       String taskName) {
        this.timestamp = timestamp;
        this.taskStatus = taskStatus;
        this.taskName = taskName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public TaskStatusRequestDto getTaskStatus() {
        return taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }
}
