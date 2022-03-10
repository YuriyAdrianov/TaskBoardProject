package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.ReleaseDto;
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

    @GetMapping("/{id{")
    public ResponseEntity<ReleaseDto> findById() {
        return ResponseEntity.ok(releaseService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ReleaseDto>> findAll() {
        return ResponseEntity.ok(releaseService.findAll());
    }

    @PostMapping
    public ResponseEntity<ReleaseDto> createRelease(@RequestBody ReleaseDto releaseDto) {
        return ResponseEntity.ok(releaseService.createRelease(releaseDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ReleaseDto> updateRelease(@RequestBody ReleaseDto releaseDto) {
        return ResponseEntity.ok(releaseService.updateRelease(releaseDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRelease(@PathVariable Long id) {
        releaseService.deleteRelease(id);
        return ResponseEntity.ok("Ok.");
    }
}
