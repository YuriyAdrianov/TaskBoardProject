package com.yuriyadr.taskboard.service.mapper;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRequestDto;
import com.yuriyadr.taskboard.dto.responseDto.WorkerResponseDto;
import com.yuriyadr.taskboard.entity.Worker;
import org.springframework.stereotype.Component;

@Component
public class WorkerMapper {
    public WorkerRequestDto toReqDto(Worker worker) {
        WorkerRequestDto workerRequestDto = new WorkerRequestDto(worker.getName(), worker.getActivity());
        return workerRequestDto;
    }

    public WorkerResponseDto toRespDto(Worker worker) {
        WorkerResponseDto workerResponseDto = new WorkerResponseDto(worker.getId(), worker.getName(), worker.getActivity());
        return workerResponseDto;
    }

    public Worker reqToEnt(WorkerRequestDto workerRequestDto) {
        Worker worker = new Worker();
        worker.setName(workerRequestDto.getName());
        worker.setActivity(workerRequestDto.getActivity());
        return worker;
    }

    public Worker respToEnt(WorkerResponseDto workerResponseDto) {
        Worker worker = new Worker();
        worker.setId(workerResponseDto.getId());
        worker.setName(workerResponseDto.getName());
        worker.setActivity(workerResponseDto.getActivity());
        return worker;
    }
}
