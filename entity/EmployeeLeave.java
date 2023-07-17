package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee_leaves")
public class EmployeeLeave {
    @Id
    @Column(name = "employee_leaves_id")
    private long employee_leaves_id;

    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "leave_id")
    private long leave_id;

    @Column(name = "leave_start_date")
    private Date leave_start_date;

    @Column(name = "leave_end_date")
    private Date leave_end_date;

    public EmployeeLeave(long employee_leaves_id, long employee_id, long leave_id, Date leave_start_date, Date leave_end_date) {
        this.employee_leaves_id = employee_leaves_id;
        this.employee_id = employee_id;
        this.leave_id = leave_id;
        this.leave_start_date = leave_start_date;
        this.leave_end_date = leave_end_date;
    }

    public EmployeeLeave() {

    }

    public long getEmployee_leaves_id() {
        return employee_leaves_id;
    }

    public void setEmployee_leaves_id(long employee_leaves_id) {
        this.employee_leaves_id = employee_leaves_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(long leave_id) {
        this.leave_id = leave_id;
    }

    public Date getLeave_start_date() {
        return leave_start_date;
    }

    public void setLeave_start_date(Date leave_start_date) {
        this.leave_start_date = leave_start_date;
    }

    public Date getLeave_end_date() {
        return leave_end_date;
    }

    public void setLeave_end_date(Date leave_end_date) {
        this.leave_end_date = leave_end_date;
    }

}
