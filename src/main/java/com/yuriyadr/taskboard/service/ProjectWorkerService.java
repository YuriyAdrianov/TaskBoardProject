package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.ProjectWorkerRequestDto;

import java.util.List;

public interface ProjectWorkerService {

    List<ProjectWorkerRequestDto> findAll();

    ProjectWorkerRequestDto findById();

    ProjectWorkerRequestDto create(ProjectWorkerRequestDto projectWorkerRequestDto);

    ProjectWorkerRequestDto update(ProjectWorkerRequestDto projectWorkerRequestDto);

    void delete(Long id);
}
