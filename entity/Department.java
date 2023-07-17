package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "department_id")
    private long department_id;

    @Column(name = "department_name")
    private String department_name;

    @Column(name = "job_categories_id")
    private long job_categories_id;

    public Department(long department_id, String department_name,
                      long job_categories_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.job_categories_id = job_categories_id;
    }

    public Department() {

    }

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public long getJob_categories_id() {
        return job_categories_id;
    }

    public void setJob_categories_id(long job_categories_id) {
        this.job_categories_id = job_categories_id;
    }



}
