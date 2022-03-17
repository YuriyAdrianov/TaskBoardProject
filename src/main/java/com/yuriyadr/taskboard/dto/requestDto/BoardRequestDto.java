package com.yuriyadr.taskboard.dto.requestDto;


public class BoardRequestDto {

    private String name;

    private String description;

    private ProjectRequestDto project;

    public BoardRequestDto(String name,
                           String description,
                           ProjectRequestDto project) {
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

    public ProjectRequestDto getProject() {
        return project;
    }
}
