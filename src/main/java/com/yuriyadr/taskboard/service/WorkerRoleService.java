package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.WorkerRoleDto;

import java.util.List;

public interface WorkerRoleService {

    List<WorkerRoleDto> findAll();

    WorkerRoleDto findById();

    WorkerRoleDto create(WorkerRoleDto workerRoleDto);

    WorkerRoleDto update(WorkerRoleDto workerRoleDto);

    void delete(Long id);
}
