package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.JobCategory;
import com.example.jforce.demo.repository.JobCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobCategoryServiceImpl implements IJobCategoryService {

    @Autowired
    private JobCategoryRepository jobCategoryRepository;

    @Override
    public List<JobCategory> listAll(){
        return jobCategoryRepository.findAll();
    }

    @Override
    public JobCategory delete(@PathVariable Long id) {
        JobCategory jobCategory = jobCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("JobCategory not exist with id :" + id));

        jobCategoryRepository.delete(jobCategory);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return jobCategory;
    }

    @Override
    public JobCategory insert(@RequestBody JobCategory jobCategory) {
        jobCategoryRepository.save(jobCategory);
        return jobCategory;
    }

    @Override
    public List<JobCategory> insertAll(@RequestBody List<JobCategory> newJobCategoryList ) {
        jobCategoryRepository.saveAll(newJobCategoryList);

        return newJobCategoryList;
    }


    @Override
    public JobCategory update(Long id, @RequestBody JobCategory jobCategory) {
        JobCategory jobCategories = jobCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("JobCategory not exist with id :" + id));

        jobCategories.setJob_categories_name(jobCategories.getJob_categories_name());

        JobCategory updatedJobCategory = jobCategoryRepository.save(jobCategory);
        return updatedJobCategory;
    }

}
