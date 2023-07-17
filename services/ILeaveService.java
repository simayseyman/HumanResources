package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.Leave;

import java.util.List;

public interface ILeaveService {
    List<Leave> listAll();

    Leave delete(Long id);

    Leave insert(Leave leave);

    Leave update(Long id, Leave leave);

    List<Leave> insertAll(List<Leave> newLeaveList);
}
