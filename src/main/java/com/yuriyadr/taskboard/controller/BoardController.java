package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.BoardRequestDto;
import com.yuriyadr.taskboard.service.BoardService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Board controller", description = "Board management")
@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardRequestDto> findById() {
        return ResponseEntity.ok(boardService.findById());
    }

    @GetMapping
    public ResponseEntity<List<BoardRequestDto>> findAll() {
        return ResponseEntity.ok(boardService.findAll());
    }

    @PostMapping
    public ResponseEntity<BoardRequestDto> createBoard(@RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.ok(boardService.create(boardRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BoardRequestDto> updateBoard(@RequestBody BoardRequestDto boardRequestDto) {
        return ResponseEntity.ok(boardService.update(boardRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBoard(@PathVariable Long id) {
        boardService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
