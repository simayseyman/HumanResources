package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.JobHistory;
import com.example.jforce.demo.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobHistoryServiceImpl implements IJobHistoryService {

    @Autowired
    private JobHistoryRepository jobHistoryRepository;

    @Override
    public List<JobHistory> listAll(){
        return jobHistoryRepository.findAll();
    }

    @Override
    public JobHistory delete(@PathVariable Long id) {
        JobHistory jobHistory = jobHistoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("JobHistory not exist with id :" + id));

        jobHistoryRepository.delete(jobHistory);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return jobHistory;
    }

    @Override
    public JobHistory insert(@RequestBody JobHistory jobHistory) {
        jobHistoryRepository.save(jobHistory);
        return jobHistory;
    }

    @Override
    public List<JobHistory> insertAll(@RequestBody List<JobHistory> newJobHistoryList ) {
        jobHistoryRepository.saveAll(newJobHistoryList);

        return newJobHistoryList;
    }


    @Override
    public JobHistory update(Long id, @RequestBody JobHistory jobHistory) {
        JobHistory jobHistories = jobHistoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("JobHistory not exist with id :" + id));

        jobHistories.setEmployee_id(jobHistory.getEmployee_id());
        jobHistories.setStart_date(jobHistory.getStart_date());
        jobHistories.setEnd_date(jobHistory.getEnd_date());
        jobHistories.setJob_id(jobHistory.getJob_id());
        jobHistories.setDepartment_id(jobHistory.getDepartment_id());

        JobHistory updatedJobHistory = jobHistoryRepository.save(jobHistory);
        return updatedJobHistory;
    }
}
