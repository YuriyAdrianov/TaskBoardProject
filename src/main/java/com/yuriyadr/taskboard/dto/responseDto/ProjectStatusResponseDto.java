package com.yuriyadr.taskboard.dto.responseDto;

public class ProjectStatusResponseDto {

    private String name;

    private String description;

    public ProjectStatusResponseDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
