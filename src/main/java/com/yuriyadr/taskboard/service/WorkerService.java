package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRequestDto;

import java.util.List;

public interface WorkerService {

    List<WorkerRequestDto> findAll();

    WorkerRequestDto findById();

    WorkerRequestDto create(WorkerRequestDto workerRequestDto);

    WorkerRequestDto update(WorkerRequestDto workerRequestDto);

    void delete(Long id);
}
