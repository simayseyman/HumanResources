package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @Column(name = "job_id")
    private long job_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "min_salary")
    private BigDecimal min_salary;

    @Column(name = "max_salary")
    private BigDecimal max_salary;

    public Job(long job_id, String job_title, BigDecimal min_salary, BigDecimal max_salary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public Job() {

    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public BigDecimal getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(BigDecimal min_salary) {
        this.min_salary = min_salary;
    }

    public BigDecimal getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(BigDecimal max_salary) {
        this.max_salary = max_salary;
    }


}
