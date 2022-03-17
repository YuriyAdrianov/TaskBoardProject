package com.yuriyadr.taskboard.dto.responseDto;

public class TaskStatusResponseDto {

    private Long id;

    private String name;

    private String description;

    public TaskStatusResponseDto(Long id,
                                 String name,
                                 String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
}
