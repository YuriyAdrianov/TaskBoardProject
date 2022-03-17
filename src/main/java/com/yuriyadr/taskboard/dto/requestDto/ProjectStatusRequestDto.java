package com.yuriyadr.taskboard.dto.requestDto;

public class ProjectStatusRequestDto {

    private String name;

    private String description;

    public ProjectStatusRequestDto(String name, String description) {
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
