package com.yuriyadr.taskboard.dto.requestDto;

public class ProjectRequestDto {

    private String name;

    private String description;

    private ProjectStatusHistoryRequestDto projectStatus;

    public ProjectRequestDto(String name,
                             String description,
                             ProjectStatusHistoryRequestDto projectStatus) {
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

    public ProjectStatusHistoryRequestDto getProjectStatus() {
        return projectStatus;
    }
}
