package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.JobHistory;

import java.util.List;

public interface IJobHistoryService {
    List<JobHistory> listAll();

    JobHistory delete(Long id);

    JobHistory insert(JobHistory jobHistory);

    JobHistory update(Long id, JobHistory jobHistory);

    List<JobHistory> insertAll(List<JobHistory> newJobHistoryList);
}
