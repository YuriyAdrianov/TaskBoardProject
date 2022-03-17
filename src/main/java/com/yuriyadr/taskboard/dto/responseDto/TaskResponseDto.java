package com.yuriyadr.taskboard.dto.responseDto;

public class TaskResponseDto {

    private Long id;

    private BoardResponseDto board;

    private String name;

    private String description;

    private WorkerResponseDto author;

    private WorkerResponseDto executive;

    private ReleaseResponseDto release;

    private TaskStatusHistoryResponseDto taskStatus;

    public TaskResponseDto(Long id,
                           BoardResponseDto board,
                           String name,
                           String description,
                           WorkerResponseDto author,
                           WorkerResponseDto executive,
                           ReleaseResponseDto release,
                           TaskStatusHistoryResponseDto taskStatus) {
        this.id = id;
        this.board = board;
        this.name = name;
        this.description = description;
        this.author = author;
        this.executive = executive;
        this.release = release;
        this.taskStatus = taskStatus;
    }

    public Long getId() {
        return id;
    }

    public BoardResponseDto getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public WorkerResponseDto getAuthor() {
        return author;
    }

    public WorkerResponseDto getExecutive() {
        return executive;
    }

    public ReleaseResponseDto getRelease() {
        return release;
    }

    public TaskStatusHistoryResponseDto getTaskStatus() {
        return taskStatus;
    }
}
