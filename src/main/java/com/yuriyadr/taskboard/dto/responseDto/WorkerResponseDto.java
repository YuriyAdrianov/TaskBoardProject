package com.yuriyadr.taskboard.dto.responseDto;

public class WorkerResponseDto {

    private String name;

    private Boolean activity;

    public WorkerResponseDto(String name, Boolean activity) {
        this.name = name;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public Boolean getActivity() {
        return activity;
    }
}
