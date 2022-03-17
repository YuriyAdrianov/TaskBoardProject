package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.ProjectStatusRequestDto;

import java.util.List;

public interface ProjectStatusService {

    List<ProjectStatusRequestDto> findAll();

    ProjectStatusRequestDto findById();

    ProjectStatusRequestDto create(ProjectStatusRequestDto projectStatusRequestDto);

    ProjectStatusRequestDto update(ProjectStatusRequestDto projectStatusRequestDto);

    void delete(Long id);
}
