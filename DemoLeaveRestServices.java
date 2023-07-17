package com.example.jforce.demo;

import com.example.jforce.demo.entity.Leave;
import com.example.jforce.demo.services.ILeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoLeaveRestServices {
    @Autowired
    private ILeaveService leaveService;

    @GetMapping(path = "/getLeaves")
    public List<Leave> getLeaves(){

        return leaveService.listAll();
    }

    @DeleteMapping(path = "/deleteLeave/{id}")
    public Leave deleteLeave(@PathVariable(name = "id") Long id ) {
        return leaveService.delete(id);
    }

    @PostMapping(path = "/addLeave")
    public Leave createLeave(@RequestBody Leave leave) {
        return leaveService.insert(leave);
    }

    @PostMapping(path = "/postLeaves")
    public List<Leave> addLeaveAll(@RequestBody List<Leave> newLeaveList) {
        return leaveService.insertAll(newLeaveList);
    }

    @PutMapping(path = "/leave/{id}")
    public Leave updateLeave(@PathVariable(name = "id")Long id, @RequestBody Leave leave) {
        return leaveService.update(id, leave);

    }
}
