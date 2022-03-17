package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.ProjectRequestDto;

import java.util.List;

public interface ProjectService {

    List<ProjectRequestDto> findAll();

    ProjectRequestDto findById();

    ProjectRequestDto create(ProjectRequestDto projectRequestDto);

    ProjectRequestDto update(ProjectRequestDto projectRequestDto);

    void delete(Long id);
}
