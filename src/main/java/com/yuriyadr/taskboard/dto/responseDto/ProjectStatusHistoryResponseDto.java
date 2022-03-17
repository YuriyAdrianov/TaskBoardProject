package com.yuriyadr.taskboard.dto.responseDto;

import java.time.LocalDateTime;

public class ProjectStatusHistoryResponseDto {

    private LocalDateTime timestamp;

    private ProjectStatusResponseDto projectStatus;

    private ProjectResponseDto project;

    public ProjectStatusHistoryResponseDto(LocalDateTime timestamp, ProjectStatusResponseDto projectStatus, ProjectResponseDto project) {
        this.timestamp = timestamp;
        this.projectStatus = projectStatus;
        this.project = project;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ProjectStatusResponseDto getProjectStatus() {
        return projectStatus;
    }

    public ProjectResponseDto getProject() {
        return project;
    }
}
