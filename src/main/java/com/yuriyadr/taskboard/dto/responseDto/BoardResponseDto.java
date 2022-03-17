package com.yuriyadr.taskboard.dto.responseDto;


public class BoardResponseDto {

    private Long id;

    private String name;

    private String description;

    private ProjectResponseDto project;

    public BoardResponseDto(Long id,
                            String name,
                            String description,
                            ProjectResponseDto project) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.project = project;
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

    public ProjectResponseDto getProject() {
        return project;
    }
}
