package com.yuriyadr.taskboard.dto.requestDto;

public class ProjectRequestDto {

    private String name;

    private String description;

    private ProjectStatusHistoryDto projectStatus;

    public ProjectRequestDto(String name, String description, ProjectStatusHistoryDto projectStatus) {
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

    public ProjectStatusHistoryDto getProjectStatus() {
        return projectStatus;
    }
}
