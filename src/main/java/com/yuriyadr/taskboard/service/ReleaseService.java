package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.ReleaseRequestDto;

import java.util.List;

public interface ReleaseService {

    List<ReleaseRequestDto> findAll();

    ReleaseRequestDto findById();

    ReleaseRequestDto create(ReleaseRequestDto releaseRequestDto);

    ReleaseRequestDto update(ReleaseRequestDto releaseRequestDto);

    void delete(Long id);
}
