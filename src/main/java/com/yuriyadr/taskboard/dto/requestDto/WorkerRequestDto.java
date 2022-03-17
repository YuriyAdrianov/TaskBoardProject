package com.yuriyadr.taskboard.dto.requestDto;

public class WorkerRequestDto {

    private String name;

    private Boolean activity;

    public WorkerRequestDto(String name,
                            Boolean activity) {
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
