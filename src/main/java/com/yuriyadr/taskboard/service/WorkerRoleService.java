package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRoleRequestDto;

import java.util.List;

public interface WorkerRoleService {

    List<WorkerRoleRequestDto> findAll();

    WorkerRoleRequestDto findById();

    WorkerRoleRequestDto create(WorkerRoleRequestDto workerRoleRequestDto);

    WorkerRoleRequestDto update(WorkerRoleRequestDto workerRoleRequestDto);

    void delete(Long id);
}
