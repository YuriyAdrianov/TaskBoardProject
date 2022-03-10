package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.ProjectWorkerDto;

import java.util.List;

public interface ProjectWorkerService {

    List<ProjectWorkerDto> findAll();

    ProjectWorkerDto findById();

    ProjectWorkerDto create(ProjectWorkerDto projectWorkerDto);

    ProjectWorkerDto update(ProjectWorkerDto projectWorkerDto);

    void delete(Long id);
}
