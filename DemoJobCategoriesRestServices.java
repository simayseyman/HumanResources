package com.example.jforce.demo;

import com.example.jforce.demo.entity.JobCategory;
import com.example.jforce.demo.services.IJobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoJobCategoriesRestServices {
    @Autowired
    private IJobCategoryService jobCategoryService;

    @GetMapping(path = "/getJobCategories")
    public List<JobCategory> getJobCategories(){

        return jobCategoryService.listAll();
    }

    @DeleteMapping(path = "/deleteJobCategory/{id}")
    public JobCategory deleteJobCategory(@PathVariable(name = "id") Long id ) {
        return jobCategoryService.delete(id);
    }

    @PostMapping(path = "/addJobCategory")
    public JobCategory createJobCategory(@RequestBody JobCategory jobCategory) {
        return jobCategoryService.insert(jobCategory);
    }

    @PostMapping(path = "/postJobCategories")
    public List<JobCategory> addJobCategoryAll(@RequestBody List<JobCategory> newJobCategoryList) {
        return jobCategoryService.insertAll(newJobCategoryList);
    }

    @PutMapping(path = "/jobCategory/{id}")
    public JobCategory updateJobCategory(@PathVariable(name = "id")Long id, @RequestBody JobCategory jobCategory) {
        return jobCategoryService.update(id, jobCategory);

    }

}
