package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.Leave;
import com.example.jforce.demo.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LeaveServiceImpl implements ILeaveService{

    @Autowired
    private LeaveRepository leaveRepository;

    @Override
    public List<Leave> listAll(){
        return leaveRepository.findAll();
    }

    @Override
    public Leave delete(@PathVariable Long id) {
        Leave leave = leaveRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Leave not exist with id :" + id));

        leaveRepository.delete(leave);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return leave;
    }

    @Override
    public Leave insert(@RequestBody Leave leave) {
        leaveRepository.save(leave);
        return leave;
    }

    @Override
    public List<Leave> insertAll(@RequestBody List<Leave> newLeaveList ) {
        leaveRepository.saveAll(newLeaveList);

        return newLeaveList;
    }


    @Override
    public Leave update(Long id, @RequestBody Leave leave) {
        Leave leaves = leaveRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Leave not exist with id :" + id));

        leaves.setLeave_type(leave.getLeave_type());

        Leave updatedLeave = leaveRepository.save(leave);
        return updatedLeave;
    }

}
