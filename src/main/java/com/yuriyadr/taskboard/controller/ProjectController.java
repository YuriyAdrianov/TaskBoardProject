package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.ProjectRequestDto;
import com.yuriyadr.taskboard.service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project controller", description = "Project management")
@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectRequestDto> findById() {
        return ResponseEntity.ok(projectService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectRequestDto>> findAll() {
        return ResponseEntity.ok(projectService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectRequestDto> createProject(@RequestBody ProjectRequestDto projectRequestDto) {
        return ResponseEntity.ok(projectService.create(projectRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectRequestDto> updateProject(@RequestBody ProjectRequestDto projectRequestDto) {
        return ResponseEntity.ok(projectService.update(projectRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable Long id) {
        projectService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
