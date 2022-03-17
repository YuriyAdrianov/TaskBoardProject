package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.BoardRequestDto;
import com.yuriyadr.taskboard.dto.responseDto.BoardResponseDto;

import java.util.List;

public interface BoardService {

    List<BoardRequestDto> findAll();

    BoardRequestDto findById(Long id);

    BoardRequestDto create(BoardRequestDto boardRequestDto);

    BoardRequestDto update(BoardRequestDto boardRequestDto, Long id);

    void delete(Long id);
}
