package com.example.jforce.demo;

import com.example.jforce.demo.entity.Job;
import com.example.jforce.demo.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoJobRestServices {
    @Autowired
    private IJobService jobService;

    @GetMapping(path = "/getJobs")
    public List<Job> getJobs(){

        return jobService.listAll();
    }

    @DeleteMapping(path = "/deleteJob/{id}")
    public Job deleteJob(@PathVariable(name = "id") Long id ) {
        return jobService.delete(id);
    }

    @PostMapping(path = "/addJob")
    public Job createJob(@RequestBody Job job) {
        return jobService.insert(job);
    }

    @PostMapping(path = "/postJobs")
    public List<Job> addJobAll(@RequestBody List<Job> newJobList) {
        return jobService.insertAll(newJobList);
    }

    @PutMapping(path = "/job/{id}")
    public Job updateJob(@PathVariable(name = "id")Long id, @RequestBody Job job) {
        return jobService.update(id, job);

    }


}
