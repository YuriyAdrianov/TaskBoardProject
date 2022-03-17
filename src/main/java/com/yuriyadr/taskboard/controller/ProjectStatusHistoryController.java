package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.ProjectStatusHistoryRequestDto;
import com.yuriyadr.taskboard.service.ProjectStatusHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project status history controller", description = "Project status history management")
@RestController
@RequestMapping("/projectStatusHistory")
public class ProjectStatusHistoryController {

    private final ProjectStatusHistoryService projectStatusHistoryService;

    @Autowired
    public ProjectStatusHistoryController(ProjectStatusHistoryService projectStatusHistoryService) {
        this.projectStatusHistoryService = projectStatusHistoryService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectStatusHistoryRequestDto> findById() {
        return ResponseEntity.ok(projectStatusHistoryService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectStatusHistoryRequestDto>> findAll() {
        return ResponseEntity.ok(projectStatusHistoryService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectStatusHistoryRequestDto> createProjectStatusHistory(@RequestBody ProjectStatusHistoryRequestDto projectStatusHistoryRequestDto) {
        return ResponseEntity.ok(projectStatusHistoryService.create(projectStatusHistoryRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectStatusHistoryRequestDto> updateProjectStatusHistory(@RequestBody ProjectStatusHistoryRequestDto projectStatusHistoryRequestDto) {
        return ResponseEntity.ok(projectStatusHistoryService.update(projectStatusHistoryRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectStatusHistory(@PathVariable Long id) {
        projectStatusHistoryService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
