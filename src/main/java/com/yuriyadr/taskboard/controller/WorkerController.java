package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRequestDto;
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
    public ResponseEntity<WorkerRequestDto> findById() {
        return ResponseEntity.ok(workerService.findById());
    }

    @GetMapping
    public ResponseEntity<List<WorkerRequestDto>> findAll() {
        return ResponseEntity.ok(workerService.findAll());
    }

    @PostMapping
    public ResponseEntity<WorkerRequestDto> createWorker(@RequestBody WorkerRequestDto workerRequestDto) {
        return ResponseEntity.ok(workerService.create(workerRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkerRequestDto> updateWorker(@RequestBody WorkerRequestDto workerRequestDto) {
        return ResponseEntity.ok(workerService.update(workerRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
