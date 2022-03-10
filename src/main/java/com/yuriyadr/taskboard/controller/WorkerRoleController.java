package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.WorkerRoleDto;
import com.yuriyadr.taskboard.service.WorkerRoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Worker role controller", description = "Worker role management")
@RestController
@RequestMapping("/workerRole")
public class WorkerRoleController {

    private final WorkerRoleService workerRoleService;

    @Autowired
    public WorkerRoleController(WorkerRoleService workerRoleService) {
        this.workerRoleService = workerRoleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerRoleDto> findById() {
        return ResponseEntity.ok(workerRoleService.findById());
    }

    @GetMapping
    public ResponseEntity<List<WorkerRoleDto>> findAll() {
        return ResponseEntity.ok(workerRoleService.findAll());
    }

    @PostMapping
    public ResponseEntity<WorkerRoleDto> createWorkerRole(@RequestBody WorkerRoleDto workerRoleDto) {
        return ResponseEntity.ok(workerRoleService.create(workerRoleDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkerRoleDto> updateWorkerRole(@RequestBody WorkerRoleDto workerRoleDto) {
        return ResponseEntity.ok(workerRoleService.update(workerRoleDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorkerRole(@PathVariable Long id) {
        workerRoleService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
