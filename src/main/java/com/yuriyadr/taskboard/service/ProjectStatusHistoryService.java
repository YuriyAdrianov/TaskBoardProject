package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.ProjectStatusHistoryRequestDto;

import java.util.List;

public interface ProjectStatusHistoryService {

    List<ProjectStatusHistoryRequestDto> findAll();

    ProjectStatusHistoryRequestDto findById();

    ProjectStatusHistoryRequestDto create(ProjectStatusHistoryRequestDto projectStatusHistoryRequestDto);

    ProjectStatusHistoryRequestDto update(ProjectStatusHistoryRequestDto projectStatusHistoryRequestDto);

    void delete(Long id);
}
