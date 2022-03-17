package com.yuriyadr.projectStatusboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.ProjectStatusRequestDto;
import com.yuriyadr.taskboard.service.ProjectStatusService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project status controller", description = "Project status management")
@RestController
@RequestMapping("/projectStatus")
public class ProjectStatusController {

    private final ProjectStatusService projectStatusService;

    @Autowired
    public ProjectStatusController(ProjectStatusService projectStatusService) {
        this.projectStatusService = projectStatusService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectStatusRequestDto> findById() {
        return ResponseEntity.ok(projectStatusService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectStatusRequestDto>> findAll() {
        return ResponseEntity.ok(projectStatusService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectStatusRequestDto> createProjectStatus(@RequestBody ProjectStatusRequestDto projectStatusRequestDto) {
        return ResponseEntity.ok(projectStatusService.create(projectStatusRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectStatusRequestDto> updateProjectStatus(@RequestBody ProjectStatusRequestDto projectStatusRequestDto) {
        return ResponseEntity.ok(projectStatusService.update(projectStatusRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectStatus(@PathVariable Long id) {
        projectStatusService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
