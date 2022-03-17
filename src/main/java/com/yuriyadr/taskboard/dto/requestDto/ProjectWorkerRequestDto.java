package com.yuriyadr.taskboard.dto.requestDto;

public class ProjectWorkerRequestDto {

    private ProjectRequestDto project;

    private WorkerRequestDto worker;

    private WorkerRoleRequestDto workerRole;

    public ProjectWorkerRequestDto(ProjectRequestDto project,
                                   WorkerRequestDto worker,
                                   WorkerRoleRequestDto workerRole) {
        this.project = project;
        this.worker = worker;
        this.workerRole = workerRole;
    }

    public ProjectRequestDto getProject() {
        return project;
    }

    public WorkerRequestDto getWorker() {
        return worker;
    }

    public WorkerRoleRequestDto getWorkerRole() {
        return workerRole;
    }
}
