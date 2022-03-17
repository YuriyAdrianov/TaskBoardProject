package com.yuriyadr.taskboard.dto.responseDto;

public class ProjectWorkerResponseDto {

    private ProjectResponseDto project;

    private WorkerResponseDto worker;

    private WorkerRoleResponseDto workerRole;

    public ProjectWorkerResponseDto(ProjectResponseDto project, WorkerResponseDto worker, WorkerRoleResponseDto workerRole) {
        this.project = project;
        this.worker = worker;
        this.workerRole = workerRole;
    }

    public ProjectResponseDto getProject() {
        return project;
    }

    public WorkerResponseDto getWorker() {
        return worker;
    }

    public WorkerRoleResponseDto getWorkerRole() {
        return workerRole;
    }
}
