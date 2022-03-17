package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.TaskRequestDto;

import java.util.List;

public interface TaskService {

    List<TaskRequestDto> findAll();

    TaskRequestDto findById();

    TaskRequestDto create(TaskRequestDto taskRequestDto);

    TaskRequestDto update(TaskRequestDto taskRequestDto);

    void delete(Long id);
}
