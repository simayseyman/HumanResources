package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.Job;

import java.util.List;

public interface IJobService {
    List<Job> listAll();

    Job delete(Long id);

    Job insert(Job job);

    Job update(Long id, Job job);

    List<Job> insertAll(List<Job> newJobList);
}
