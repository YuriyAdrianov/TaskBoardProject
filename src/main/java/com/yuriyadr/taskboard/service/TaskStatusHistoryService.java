package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.TaskStatusHistoryRequestDto;

import java.util.List;

public interface TaskStatusHistoryService {

    List<TaskStatusHistoryRequestDto> findAll();

    TaskStatusHistoryRequestDto findById();

    TaskStatusHistoryRequestDto create(TaskStatusHistoryRequestDto taskStatusHistoryRequestDto);

    TaskStatusHistoryRequestDto update(TaskStatusHistoryRequestDto taskStatusHistoryRequestDto);

    void delete(Long id);
}
