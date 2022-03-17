package com.yuriyadr.taskboard.dto.responseDto;


public class BoardResponseDto {

    private String name;

    private String description;

    private ProjectResponseDto project;

    public BoardResponseDto(String name, String description, ProjectResponseDto project) {
        this.name = name;
        this.description = description;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProjectResponseDto getProject() {
        return project;
    }
}
