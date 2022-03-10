package com.yuriyadr.taskboard.service;

import com.yuriyadr.taskboard.dto.BoardDto;

import java.util.List;

public interface BoardService {

    List<BoardDto> findAll();

    BoardDto findById();

    BoardDto create(BoardDto boardDto);

    BoardDto update(BoardDto boardDto);

    void delete(Long id);
}
