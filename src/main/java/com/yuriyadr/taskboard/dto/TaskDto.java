package com.yuriyadr.taskboard.dto;

public class TaskDto {

    private String boardName;

    private String name;

    private String description;

    private String authorName;

    private String executiveName;

    private Double releaseVersion;

    private String taskStatus;

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getExecutiveName() {
        return executiveName;
    }

    public void setExecutiveName(String executiveName) {
        this.executiveName = executiveName;
    }

    public Double getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(Double releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
