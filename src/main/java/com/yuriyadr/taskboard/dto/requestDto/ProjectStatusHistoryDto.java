package com.yuriyadr.taskboard.dto.requestDto;

import java.time.LocalDateTime;

public class ProjectStatusHistoryDto {

    private LocalDateTime timestamp;

    private ProjectStatusRequestDto projectStatus;

    private ProjectRequestDto project;

    public ProjectStatusHistoryDto(LocalDateTime timestamp, ProjectStatusRequestDto projectStatus, ProjectRequestDto project) {
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
