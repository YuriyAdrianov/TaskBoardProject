package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.TaskStatusHistoryDto;

import java.util.List;

public interface TaskStatusHistoryService {

    List<TaskStatusHistoryDto> findAll();

    TaskStatusHistoryDto findById();

    TaskStatusHistoryDto create(TaskStatusHistoryDto taskStatusHistoryDto);

    TaskStatusHistoryDto update(TaskStatusHistoryDto taskStatusHistoryDto);

    void delete(Long id);
}
