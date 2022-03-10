package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.ProjectStatusDto;

import java.util.List;

public interface ProjectStatusService {

    List<ProjectStatusDto> findAll();

    ProjectStatusDto findById();

    ProjectStatusDto create(ProjectStatusDto projectStatusDto);

    ProjectStatusDto update(ProjectStatusDto projectStatusDto);

    void delete(Long id);
}
