package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.ReleaseRequestDto;
import com.yuriyadr.taskboard.service.ReleaseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Release controller", description = "Release management")
@RestController
@RequestMapping("/release")
public class ReleaseController {

    private final ReleaseService releaseService;

    @Autowired
    public ReleaseController(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReleaseRequestDto> findById() {
        return ResponseEntity.ok(releaseService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ReleaseRequestDto>> findAll() {
        return ResponseEntity.ok(releaseService.findAll());
    }

    @PostMapping
    public ResponseEntity<ReleaseRequestDto> createRelease(@RequestBody ReleaseRequestDto releaseRequestDto) {
        return ResponseEntity.ok(releaseService.create(releaseRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReleaseRequestDto> updateRelease(@RequestBody ReleaseRequestDto releaseRequestDto) {
        return ResponseEntity.ok(releaseService.update(releaseRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRelease(@PathVariable Long id) {
        releaseService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
