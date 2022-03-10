package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.BoardDto;
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
    public ResponseEntity<BoardDto> findById() {
        return ResponseEntity.ok(boardService.findById());
    }

    @GetMapping
    public ResponseEntity<List<BoardDto>> findAll() {
        return ResponseEntity.ok(boardService.findAll());
    }

    @PostMapping
    public ResponseEntity<BoardDto> createBoard(@RequestBody BoardDto boardDto) {
        return ResponseEntity.ok(boardService.create(boardDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BoardDto> updateBoard(@RequestBody BoardDto boardDto) {
        return ResponseEntity.ok(boardService.update(boardDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBoard(@PathVariable Long id) {
        boardService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
