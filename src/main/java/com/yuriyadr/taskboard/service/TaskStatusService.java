package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.TaskStatusRequestDto;

import java.util.List;

public interface TaskStatusService {

    List<TaskStatusRequestDto> findAll();

    TaskStatusRequestDto findById();

    TaskStatusRequestDto create(TaskStatusRequestDto taskStatusRequestDto);

    TaskStatusRequestDto update(TaskStatusRequestDto taskStatusRequestDto);

    void delete(Long id);
}
