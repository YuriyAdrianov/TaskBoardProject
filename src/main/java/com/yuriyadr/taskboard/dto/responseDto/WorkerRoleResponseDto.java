package com.yuriyadr.taskboard.dto.responseDto;

public class WorkerRoleResponseDto {

    private String name;

    private String description;

    public WorkerRoleResponseDto(String name, String description) {
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
