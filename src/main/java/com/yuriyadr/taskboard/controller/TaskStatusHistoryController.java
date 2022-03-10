package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.TaskStatusHistoryDto;
import com.yuriyadr.taskboard.service.TaskStatusHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Task status history controller", description = "Task status history management")
@RestController
@RequestMapping("/taskStatusHistory")
public class TaskStatusHistoryController {

    private final TaskStatusHistoryService taskStatusHistoryService;

    @Autowired
    public TaskStatusHistoryController(TaskStatusHistoryService taskStatusHistoryService) {
        this.taskStatusHistoryService = taskStatusHistoryService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskStatusHistoryDto> findById() {
        return ResponseEntity.ok(taskStatusHistoryService.findById());
    }

    @GetMapping
    public ResponseEntity<List<TaskStatusHistoryDto>> findAll() {
        return ResponseEntity.ok(taskStatusHistoryService.findAll());
    }

    @PostMapping
    public ResponseEntity<TaskStatusHistoryDto> createTaskStatusHistory(@RequestBody TaskStatusHistoryDto taskStatusHistoryDto) {
        return ResponseEntity.ok(taskStatusHistoryService.create(taskStatusHistoryDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TaskStatusHistoryDto> updateTaskStatusHistory(@RequestBody TaskStatusHistoryDto taskStatusHistoryDto) {
        return ResponseEntity.ok(taskStatusHistoryService.update(taskStatusHistoryDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTaskStatusHistory(@PathVariable Long id) {
        taskStatusHistoryService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
