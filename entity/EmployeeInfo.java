package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {
    @Id
    @Column(name = "employee_info_id")
    private long employee_info_id;

    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "employee_graduate_degree")
    private String employee_graduate_degree;

    @Column(name = "employee_graduated_university")
    private String employee_graduated_university;

    @Column(name = "employee_marital_status")
    private String employee_marital_status;

    public EmployeeInfo(long employee_info_id, long employee_id,
                        String employee_graduate_degree, String employee_graduated_university,
                        String employee_marital_status) {
        this.employee_info_id = employee_info_id;
        this.employee_id = employee_id;
        this.employee_graduate_degree = employee_graduate_degree;
        this.employee_graduated_university = employee_graduated_university;
        this.employee_marital_status = employee_marital_status;
    }

    public EmployeeInfo() {

    }

    public long getEmployee_info_id() {
        return employee_info_id;
    }

    public void setEmployee_info_id(long employee_info_id) {
        this.employee_info_id = employee_info_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_graduate_degree() {
        return employee_graduate_degree;
    }

    public void setEmployee_graduate_degree(String employee_graduate_degree) {
        this.employee_graduate_degree = employee_graduate_degree;
    }

    public String getEmployee_graduated_university() {
        return employee_graduated_university;
    }

    public void setEmployee_graduated_university(String employee_graduated_university) {
        this.employee_graduated_university = employee_graduated_university;
    }

    public String getEmployee_marital_status() {
        return employee_marital_status;
    }

    public void setEmployee_marital_status(String employee_marital_status) {
        this.employee_marital_status = employee_marital_status;
    }
}
