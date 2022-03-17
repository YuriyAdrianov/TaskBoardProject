package com.yuriyadr.taskboard.controller;

import com.yuriyadr.taskboard.dto.requestDto.TaskRequestDto;
import com.yuriyadr.taskboard.service.TaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Task controller", description = "Task management")
@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskRequestDto> findById() {
        return ResponseEntity.ok(taskService.findById());
    }

    @GetMapping
    public ResponseEntity<List<TaskRequestDto>> findAll() {
        return ResponseEntity.ok(taskService.findAll());
    }

    @PostMapping
    public ResponseEntity<TaskRequestDto> createTask(@RequestBody TaskRequestDto taskRequestDto) {
        return ResponseEntity.ok(taskService.create(taskRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskRequestDto> updateTask(@RequestBody TaskRequestDto taskRequestDto) {
        return ResponseEntity.ok(taskService.update(taskRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {
        taskService.delete(id);
        return ResponseEntity.ok("Ok.");
    }
}
