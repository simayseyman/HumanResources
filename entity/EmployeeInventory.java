package com.example.jforce.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee_inventory")
public class EmployeeInventory {
    @Id
    @Column(name = "employee_inventory_id")
    private long employee_inventory_id;

    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "receipt_date")
    private Date receipt_date;

    @Column(name = "issue_date")
    private Date issue_date;

    @Column(name = "deliver_employee_id")
    private long deliver_employee_id;

    @Column(name = "receive_employee_id")
    private long receive_employee_id;

    @Column(name = "inventory_serial_number")
    private long inventory_serial_number;

    public EmployeeInventory(long employee_inventory_id, long employee_id,
                             Date receipt_date, Date issue_date, long deliver_employee_id,
                             long receive_employee_id, long inventory_serial_number) {
        this.employee_inventory_id = employee_inventory_id;
        this.employee_id = employee_id;
        this.receipt_date = receipt_date;
        this.issue_date = issue_date;
        this.deliver_employee_id = deliver_employee_id;
        this.receive_employee_id = receive_employee_id;
        this.inventory_serial_number = inventory_serial_number;
    }

    public EmployeeInventory() {

    }

    public long getEmployee_inventory_id() {
        return employee_inventory_id;
    }

    public void setEmployee_inventory_id(long employee_inventory_id) {
        this.employee_inventory_id = employee_inventory_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public Date getReceipt_date() {
        return receipt_date;
    }

    public void setReceipt_date(Date receipt_date){ this.receipt_date = receipt_date;}

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public long getDeliver_employee_id() {
        return deliver_employee_id;
    }

    public void setDeliver_employee_id(long deliver_employee_id) {
        this.deliver_employee_id = deliver_employee_id;
    }

    public long getReceive_employee_id() {
        return receive_employee_id;
    }

    public void setReceive_employee_id(long receive_employee_id) {
        this.receive_employee_id = receive_employee_id;
    }

    public long getInventory_serial_number() {
        return inventory_serial_number;
    }

    public void setInventory_serial_number(long inventory_serial_number) {
        this.inventory_serial_number = inventory_serial_number;
    }


}
