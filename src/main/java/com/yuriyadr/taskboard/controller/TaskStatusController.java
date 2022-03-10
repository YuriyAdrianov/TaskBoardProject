package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.TaskStatusDto;
import com.yuriyadr.taskboard.service.TaskStatusService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Task status controller", description = "Task status management")
@RestController
@RequestMapping("/taskStatus")
public class TaskStatusController {

    private final TaskStatusService taskStatusService;

    @Autowired
    public TaskStatusController(TaskStatusService taskStatusService) {
        this.taskStatusService = taskStatusService;
    }

    @GetMapping("/{id{")
    public ResponseEntity<TaskStatusDto> findById() {
        return ResponseEntity.ok(taskStatusService.findById());
    }

    @GetMapping
    public ResponseEntity<List<TaskStatusDto>> findAll() {
        return ResponseEntity.ok(taskStatusService.findAll());
    }

    @PostMapping
    public ResponseEntity<TaskStatusDto> createTaskStatus(@RequestBody TaskStatusDto taskStatusDto) {
        return ResponseEntity.ok(taskStatusService.create(taskStatusDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TaskStatusDto> updateTaskStatus(@RequestBody TaskStatusDto taskStatusDto) {
        return ResponseEntity.ok(taskStatusService.update(taskStatusDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTaskStatus(@PathVariable Long id) {
        taskStatusService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
