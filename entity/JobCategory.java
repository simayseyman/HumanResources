package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_categories")
public class JobCategory {

    @Id
    @Column(name = "job_categories_id")
    private long job_categories_id;

    @Column(name = "job_categories_name")
    private String job_categories_name;

    public JobCategory(long job_categories_id, String job_categories_name) {
        this.job_categories_id = job_categories_id;
        this.job_categories_name = job_categories_name;
    }

    public JobCategory() {

    }

    public long getJob_categories_id() {
        return job_categories_id;
    }

    public void setJob_categories_id(long job_categories_id) {
        this.job_categories_id = job_categories_id;
    }

    public String getJob_categories_name() {
        return job_categories_name;
    }

    public void setJob_categories_name(String job_categories_name) {
        this.job_categories_name = job_categories_name;
    }

}
