package com.yuriyadr.taskboard.dto.responseDto;

public class ProjectResponseDto {

    private String name;

    private String description;

    private ProjectStatusHistoryResponseDto projectStatus;

    public ProjectResponseDto(String name, String description, ProjectStatusHistoryResponseDto projectStatus) {
        this.name = name;
        this.description = description;
        this.projectStatus = projectStatus;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProjectStatusHistoryResponseDto getProjectStatus() {
        return projectStatus;
    }
}
