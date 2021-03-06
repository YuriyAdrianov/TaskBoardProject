package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "ProjectWorker")
public class ProjectWorker {

    @Id
    @SequenceGenerator(name = "projectWorkerIdSeq", sequenceName = "project_worker_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectWorkerIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "project_id", nullable = false)
    private Long projectId;

    @Column(name = "worker_id", nullable = false)
    private Long workerId;

    @Column(name = "worker_role_id", nullable = false)
    private Long workerRoleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public Long getWorkerRoleId() {
        return workerRoleId;
    }

    public void setWorkerRoleId(Long workerRoleId) {
        this.workerRoleId = workerRoleId;
    }
}
