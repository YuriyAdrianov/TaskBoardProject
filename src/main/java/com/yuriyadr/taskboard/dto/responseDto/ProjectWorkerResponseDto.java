package com.yuriyadr.taskboard.dto.responseDto;

public class ProjectWorkerResponseDto {

    private Long id;

    private ProjectResponseDto project;

    private WorkerResponseDto worker;

    private WorkerRoleResponseDto workerRole;

    public ProjectWorkerResponseDto(Long id,
                                    ProjectResponseDto project,
                                    WorkerResponseDto worker,
                                    WorkerRoleResponseDto workerRole) {
        this.id = id;
        this.project = project;
        this.worker = worker;
        this.workerRole = workerRole;
    }

    public Long getId() {
        return id;
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
