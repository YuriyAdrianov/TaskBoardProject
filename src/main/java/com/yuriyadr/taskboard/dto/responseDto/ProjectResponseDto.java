package com.yuriyadr.taskboard.dto.responseDto;

public class ProjectResponseDto {

    private Long id;

    private String name;

    private String description;

    private ProjectStatusHistoryResponseDto projectStatus;

    public ProjectResponseDto(Long id,
                              String name,
                              String description,
                              ProjectStatusHistoryResponseDto projectStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectStatus = projectStatus;
    }

    public Long getId() {
        return id;
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
