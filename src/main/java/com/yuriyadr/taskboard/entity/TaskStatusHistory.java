package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "TaskStatusHistory")
public class TaskStatusHistory {

    @Id
    @SequenceGenerator(name = "taskStatusHistoryIdSeq", sequenceName = "task_status_history_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskStatusHistoryIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

*
}
