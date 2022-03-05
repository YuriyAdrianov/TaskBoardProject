package com.yuriyadr.taskboard.entity;

import javax.persistence.*;

@Entity
@Table(name = "ProjectStatusHistory")
public class ProjectStatusHistory {

    @Id
    @SequenceGenerator(name = "projectStatusHistoryIdSeq", sequenceName = "project_status_history_id_seq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectStatusHistoryIdSeq")
    @Column(name = "id", nullable = false)
    private Long id;

*
}
