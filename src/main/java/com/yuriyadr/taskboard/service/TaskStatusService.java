package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.TaskStatusDto;

import java.util.List;

public interface TaskStatusService {

    List<TaskStatusDto> findAll();

    TaskStatusDto findById();

    TaskStatusDto create(TaskStatusDto taskStatusDto);

    TaskStatusDto update(TaskStatusDto taskStatusDto);

    void delete(Long id);
}
