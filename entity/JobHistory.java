package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "job_history")
public class JobHistory {

    @Id
    @Column(name = "job_history_id")
    private long job_history_id;

    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "job_id")
    private long job_id;

    @Column(name = "department_id")
    private long department_id;


    public JobHistory(long job_history_id, long employee_id, Date start_date,
                      Date end_date, long job_id, long department_id) {
        this.job_history_id = job_history_id;
        this.employee_id = employee_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.job_id = job_id;
        this.department_id = department_id;
    }

    public JobHistory() {

    }

    public long getJob_history_id() {
        return job_history_id;
    }

    public void setJob_history_id(long job_history_id) {
        this.job_history_id = job_history_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }
}
