package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.ProjectWorkerDto;
import com.yuriyadr.taskboard.service.ProjectWorkerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project worker controller", description = "Project worker management")
@RestController
@RequestMapping("/projectWorker")
public class ProjectWorkerController {

    private final ProjectWorkerService projectWorkerService;

    @Autowired
    public ProjectWorkerController(ProjectWorkerService projectWorkerService) {
        this.projectWorkerService = projectWorkerService;
    }

    @GetMapping("/{id{")
    public ResponseEntity<ProjectWorkerDto> findById() {
        return ResponseEntity.ok(projectWorkerService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectWorkerDto>> findAll() {
        return ResponseEntity.ok(projectWorkerService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectWorkerDto> createProjectWorker(@RequestBody ProjectWorkerDto projectWorkerDto) {
        return ResponseEntity.ok(projectWorkerService.create(projectWorkerDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectWorkerDto> updateProjectWorker(@RequestBody ProjectWorkerDto projectWorkerDto) {
        return ResponseEntity.ok(projectWorkerService.update(projectWorkerDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectWorker(@PathVariable Long id) {
        projectWorkerService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
