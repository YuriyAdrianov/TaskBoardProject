package com.yuriyadr.taskboard.dto.responseDto;

public class WorkerResponseDto {

    private Long id;

    private String name;

    private Boolean activity;

    public WorkerResponseDto(Long id,
                             String name,
                             Boolean activity) {
        this.id = id;
        this.name = name;
        this.activity = activity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getActivity() {
        return activity;
    }
}
