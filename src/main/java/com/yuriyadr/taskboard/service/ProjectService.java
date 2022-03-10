package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> findAll();

    ProjectDto findById();

    ProjectDto create(ProjectDto projectDto);

    ProjectDto update(ProjectDto projectDto);

    void delete(Long id);
}
