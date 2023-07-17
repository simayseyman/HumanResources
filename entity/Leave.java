package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leaves")
public class Leave {
    @Id
    @Column(name = "leave_id")
    private long leave_id;

    @Column(name = "leave_type")
    private String leave_type;

    public Leave(long leave_id, String leave_type) {
        this.leave_id = leave_id;
        this.leave_type = leave_type;
    }

    public Leave() {

    }

    public long getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(long leave_id) {
        this.leave_id = leave_id;
    }

    public String getLeave_type() {
        return leave_type;
    }

    public void setLeave_type(String leave_type) {
        this.leave_type = leave_type;
    }

}
