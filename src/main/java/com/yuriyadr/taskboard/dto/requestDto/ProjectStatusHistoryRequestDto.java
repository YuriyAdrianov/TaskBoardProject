package com.yuriyadr.taskboard.dto.requestDto;

import java.time.LocalDateTime;

public class ProjectStatusHistoryRequestDto {

    private LocalDateTime timestamp;

    private ProjectStatusRequestDto projectStatus;

    private ProjectRequestDto project;

    public ProjectStatusHistoryRequestDto(LocalDateTime timestamp, ProjectStatusRequestDto projectStatus, ProjectRequestDto project) {
        this.timestamp = timestamp;
        this.projectStatus = projectStatus;
        this.project = project;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ProjectStatusRequestDto getProjectStatus() {
        return projectStatus;
    }

    public ProjectRequestDto getProject() {
        return project;
    }
}
