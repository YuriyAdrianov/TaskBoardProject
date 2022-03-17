package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.requestDto.BoardRequestDto;

import java.util.List;

public interface BoardService {

    List<BoardRequestDto> findAll();

    BoardRequestDto findById();

    BoardRequestDto create(BoardRequestDto boardRequestDto);

    BoardRequestDto update(BoardRequestDto boardRequestDto);

    void delete(Long id);
}
