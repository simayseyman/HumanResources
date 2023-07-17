package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.JobCategory;

import java.util.List;

public interface IJobCategoryService {
    List<JobCategory> listAll();

    JobCategory delete(Long id);

    JobCategory insert(JobCategory jobCategory);

    JobCategory update(Long id, JobCategory jobCategory);

    List<JobCategory> insertAll(List<JobCategory> newJobCategoryList);
}
