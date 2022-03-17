package com.yuriyadr.taskboard.dto.responseDto;

import java.time.LocalDateTime;

public class ProjectStatusHistoryResponseDto {

    private Long id;

    private LocalDateTime timestamp;

    private ProjectStatusResponseDto projectStatus;

    private ProjectResponseDto project;

    public ProjectStatusHistoryResponseDto(Long id,
                                           LocalDateTime timestamp,
                                           ProjectStatusResponseDto projectStatus,
                                           ProjectResponseDto project) {
        this.id = id;
        this.timestamp = timestamp;
        this.projectStatus = projectStatus;
        this.project = project;
    }

    public Long getId() {
        return id;
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
