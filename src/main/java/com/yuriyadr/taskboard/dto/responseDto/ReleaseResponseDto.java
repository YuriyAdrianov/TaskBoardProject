package com.yuriyadr.taskboard.dto.responseDto;

import java.time.LocalDate;

public class ReleaseResponseDto {

    private Long id;

    private ProjectResponseDto project;

    private Double version;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    public ReleaseResponseDto(Long id,
                              ProjectResponseDto project,
                              Double version,
                              String description,
                              LocalDate startDate,
                              LocalDate endDate) {
        this.id = id;
        this.project = project;
        this.version = version;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public ProjectResponseDto getProject() {
        return project;
    }

    public Double getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
