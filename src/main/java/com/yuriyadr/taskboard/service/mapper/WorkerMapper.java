package com.yuriyadr.taskboard.service.mapper;

import com.yuriyadr.taskboard.dto.WorkerDto;
import com.yuriyadr.taskboard.entity.Worker;
import org.springframework.stereotype.Component;

@Component
public class WorkerMapper {
    public WorkerDto toDto(Worker worker) {
        WorkerDto workerDto = new WorkerDto();
        workerDto.setName(worker.getName());
        workerDto.setActivity(worker.getActivity());
        return workerDto;
    }

    public Worker toEntity(WorkerDto workerDto) {
        Worker worker = new Worker();
        worker.setName(workerDto.getName());
        worker.setActivity(workerDto.getActivity());
        return worker;
    }
}
