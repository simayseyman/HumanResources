package com.example.jforce.demo;

import com.example.jforce.demo.entity.JobHistory;
import com.example.jforce.demo.services.IJobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoJobHistoryRestServices {
    @Autowired
    private IJobHistoryService jobHistoryService;

    @GetMapping(path = "/getJobHistories")
    public List<JobHistory> getJobHistories(){

        return jobHistoryService.listAll();
    }

    @DeleteMapping(path = "/deleteJobHistory/{id}")
    public JobHistory deleteJobHistory(@PathVariable(name = "id") Long id ) {
        return jobHistoryService.delete(id);
    }

    @PostMapping(path = "/addJobHistory")
    public JobHistory createJobHistory(@RequestBody JobHistory jobHistory) {
        return jobHistoryService.insert(jobHistory);
    }

    @PostMapping(path = "/postJobHistories")
    public List<JobHistory> addJobHistoryAll(@RequestBody List<JobHistory> newJobHistoryList) {
        return jobHistoryService.insertAll(newJobHistoryList);
    }

    @PutMapping(path = "/jobHistory/{id}")
    public JobHistory updateJobHistory(@PathVariable(name = "id")Long id, @RequestBody JobHistory jobHistory) {
        return jobHistoryService.update(id, jobHistory);

    }
}
