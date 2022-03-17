package com.yuriyadr.taskboard.service.impl;

import com.yuriyadr.taskboard.dto.requestDto.WorkerRequestDto;
import com.yuriyadr.taskboard.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Override
    public List<WorkerRequestDto> findAll() {
        return null;
    }

    @Override
    public WorkerRequestDto findById() {
        return null;
    }

    @Override
    public WorkerRequestDto create(WorkerRequestDto workerRequestDto) {
        return null;
    }

    @Override
    public WorkerRequestDto update(WorkerRequestDto workerRequestDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
