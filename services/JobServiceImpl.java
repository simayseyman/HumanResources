package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.Job;
import com.example.jforce.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements IJobService{
    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> listAll(){
        return jobRepository.findAll();
    }

    @Override
    public Job delete(@PathVariable Long id) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Job not exist with id :" + id));

        jobRepository.delete(job);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return job;
    }

    @Override
    public Job insert(@RequestBody Job job) {
        jobRepository.save(job);
        return job;
    }

    @Override
    public List<Job> insertAll(@RequestBody List<Job> newJobList ) {
        jobRepository.saveAll(newJobList);

        return newJobList;
    }


    @Override
    public Job update(Long id, @RequestBody Job job) {
        Job jobs = jobRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Job not exist with id :" + id));

        jobs.setJob_title(job.getJob_title());
        jobs.setMin_salary(job.getMin_salary());
        jobs.setMax_salary(job.getMax_salary());

        Job updatedJob = jobRepository.save(job);
        return updatedJob;
    }
}
