package com.yuriyadr.taskboard.service.mapper;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRequestDto;
import com.yuriyadr.taskboard.entity.Worker;
import org.springframework.stereotype.Component;

@Component
public class WorkerMapper {
    public WorkerRequestDto toDto(Worker worker) {
        WorkerRequestDto workerRequestDto = new WorkerRequestDto(worker.getName(), worker.getActivity());
        return workerRequestDto;
    }

    public Worker toEntity(WorkerRequestDto workerRequestDto) {
        Worker worker = new Worker();
        worker.setName(workerRequestDto.getName());
        worker.setActivity(workerRequestDto.getActivity());
        return worker;
    }
}
