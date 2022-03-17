package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.TaskStatusHistoryRequestDto;
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
    public ResponseEntity<TaskStatusHistoryRequestDto> findById() {
        return ResponseEntity.ok(taskStatusHistoryService.findById());
    }

    @GetMapping
    public ResponseEntity<List<TaskStatusHistoryRequestDto>> findAll() {
        return ResponseEntity.ok(taskStatusHistoryService.findAll());
    }

    @PostMapping
    public ResponseEntity<TaskStatusHistoryRequestDto> createTaskStatusHistory(@RequestBody TaskStatusHistoryRequestDto taskStatusHistoryRequestDto) {
        return ResponseEntity.ok(taskStatusHistoryService.create(taskStatusHistoryRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskStatusHistoryRequestDto> updateTaskStatusHistory(@RequestBody TaskStatusHistoryRequestDto taskStatusHistoryRequestDto) {
        return ResponseEntity.ok(taskStatusHistoryService.update(taskStatusHistoryRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTaskStatusHistory(@PathVariable Long id) {
        taskStatusHistoryService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
