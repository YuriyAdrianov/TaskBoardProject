package com.yuriyadr.projectStatusboard.controller;

import com.yuriyadr.taskboard.dto.ProjectStatusDto;
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

    @GetMapping("/{id{")
    public ResponseEntity<ProjectStatusDto> findById() {
        return ResponseEntity.ok(projectStatusService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectStatusDto>> findAll() {
        return ResponseEntity.ok(projectStatusService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectStatusDto> createProjectStatus(@RequestBody ProjectStatusDto projectStatusDto) {
        return ResponseEntity.ok(projectStatusService.create(projectStatusDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectStatusDto> updateProjectStatus(@RequestBody ProjectStatusDto projectStatusDto) {
        return ResponseEntity.ok(projectStatusService.update(projectStatusDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectStatus(@PathVariable Long id) {
        projectStatusService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
