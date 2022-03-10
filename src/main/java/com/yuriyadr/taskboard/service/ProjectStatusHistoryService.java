package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.ProjectStatusHistoryDto;

import java.util.List;

public interface ProjectStatusHistoryService {

    List<ProjectStatusHistoryDto> findAll();

    ProjectStatusHistoryDto findById();

    ProjectStatusHistoryDto create(ProjectStatusHistoryDto projectStatusHistoryDto);

    ProjectStatusHistoryDto update(ProjectStatusHistoryDto projectStatusHistoryDto);

    void delete(Long id);
}
