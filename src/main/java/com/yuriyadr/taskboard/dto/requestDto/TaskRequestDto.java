package com.yuriyadr.taskboard.dto.requestDto;

public class TaskRequestDto {

    private BoardRequestDto board;

    private String name;

    private String description;

    private WorkerRequestDto author;

    private WorkerRequestDto executive;

    private ReleaseRequestDto release;

    private TaskStatusHistoryRequestDto taskStatus;

    public TaskRequestDto(BoardRequestDto board,
                          String name,
                          String description,
                          WorkerRequestDto author,
                          WorkerRequestDto executive,
                          ReleaseRequestDto release,
                          TaskStatusHistoryRequestDto taskStatus) {
        this.board = board;
        this.name = name;
        this.description = description;
        this.author = author;
        this.executive = executive;
        this.release = release;
        this.taskStatus = taskStatus;
    }

    public BoardRequestDto getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public WorkerRequestDto getAuthor() {
        return author;
    }

    public WorkerRequestDto getExecutive() {
        return executive;
    }

    public ReleaseRequestDto getRelease() {
        return release;
    }

    public TaskStatusHistoryRequestDto getTaskStatus() {
        return taskStatus;
    }
}
