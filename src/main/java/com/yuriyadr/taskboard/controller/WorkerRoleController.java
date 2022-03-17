package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRoleRequestDto;
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
    public ResponseEntity<WorkerRoleRequestDto> findById() {
        return ResponseEntity.ok(workerRoleService.findById());
    }

    @GetMapping
    public ResponseEntity<List<WorkerRoleRequestDto>> findAll() {
        return ResponseEntity.ok(workerRoleService.findAll());
    }

    @PostMapping
    public ResponseEntity<WorkerRoleRequestDto> createWorkerRole(@RequestBody WorkerRoleRequestDto workerRoleRequestDto) {
        return ResponseEntity.ok(workerRoleService.create(workerRoleRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkerRoleRequestDto> updateWorkerRole(@RequestBody WorkerRoleRequestDto workerRoleRequestDto) {
        return ResponseEntity.ok(workerRoleService.update(workerRoleRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorkerRole(@PathVariable Long id) {
        workerRoleService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
