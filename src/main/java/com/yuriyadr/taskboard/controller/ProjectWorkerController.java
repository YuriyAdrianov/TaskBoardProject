package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.ProjectWorkerRequestDto;
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

    @GetMapping("/{id}")
    public ResponseEntity<ProjectWorkerRequestDto> findById() {
        return ResponseEntity.ok(projectWorkerService.findById());
    }

    @GetMapping
    public ResponseEntity<List<ProjectWorkerRequestDto>> findAll() {
        return ResponseEntity.ok(projectWorkerService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProjectWorkerRequestDto> createProjectWorker(@RequestBody ProjectWorkerRequestDto projectWorkerRequestDto) {
        return ResponseEntity.ok(projectWorkerService.create(projectWorkerRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectWorkerRequestDto> updateProjectWorker(@RequestBody ProjectWorkerRequestDto projectWorkerRequestDto) {
        return ResponseEntity.ok(projectWorkerService.update(projectWorkerRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProjectWorker(@PathVariable Long id) {
        projectWorkerService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
