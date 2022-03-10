package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.TaskDto;

import java.util.List;

public interface TaskService {

    List<TaskDto> findAll();

    TaskDto findById();

    TaskDto create(TaskDto taskDto);

    TaskDto update(TaskDto taskDto);

    void delete(Long id);
}
