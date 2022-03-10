package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.WorkerDto;

import java.util.List;

public interface WorkerService {

    List<WorkerDto> findAll();

    WorkerDto findById();

    WorkerDto create(WorkerDto workerDto);

    WorkerDto update(WorkerDto workerDto);

    void delete(Long id);
}
