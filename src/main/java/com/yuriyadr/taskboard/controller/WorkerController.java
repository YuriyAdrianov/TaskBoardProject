package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.WorkerDto;
import com.yuriyadr.taskboard.service.WorkerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Worker controller", description = "Worker management")
@RestController
@RequestMapping("/worker")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerDto> findById() {
        return ResponseEntity.ok(workerService.findById());
    }

    @GetMapping
    public ResponseEntity<List<WorkerDto>> findAll() {
        return ResponseEntity.ok(workerService.findAll());
    }

    @PostMapping
    public ResponseEntity<WorkerDto> createWorker(@RequestBody WorkerDto workerDto) {
        return ResponseEntity.ok(workerService.create(workerDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkerDto> updateWorker(@RequestBody WorkerDto workerDto) {
        return ResponseEntity.ok(workerService.update(workerDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
