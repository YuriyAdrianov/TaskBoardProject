package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.ReleaseDto;

import java.util.List;

public interface ReleaseService {

    List<ReleaseDto> findAll();

    ReleaseDto findById();

    ReleaseDto create(ReleaseDto releaseDto);

    ReleaseDto update(ReleaseDto releaseDto);

    void delete(Long id);
}
