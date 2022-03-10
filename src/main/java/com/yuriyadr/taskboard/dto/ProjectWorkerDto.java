package com.yuriyadr.taskboard.dto;

public class ProjectWorkerDto {

    private String projectName;

    private String workerName;

    private String workerRoleName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerRoleName() {
        return workerRoleName;
    }

    public void setWorkerRoleName(String workerRoleName) {
        this.workerRoleName = workerRoleName;
    }
}
