package com.example.jforce.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "inventory_serial_number")
    private long inventory_serial_number;

    @Column(name = "inventory_type")
    private String inventory_type;

    @Column(name = "inventory_brand")
    private String inventory_brand;

    @Column(name = "inventory_model")
    private String inventory_model;

    @Column(name = "inventory_entry_date")
    private LocalDate inventory_entry_date;

    @Column(name = "inventory_situation")
    private String inventory_situation;

    public Inventory(long inventory_serial_number, String inventory_type, String inventory_brand,
                     String inventory_model, LocalDate inventory_entry_date, String inventory_situation) {
        this.inventory_serial_number = inventory_serial_number;
        this.inventory_type = inventory_type;
        this.inventory_brand = inventory_brand;
        this.inventory_model = inventory_model;
        this.inventory_entry_date = inventory_entry_date;
        this.inventory_situation = inventory_situation;
    }

    public Inventory() {

    }

    public long getInventory_serial_number() {
        return inventory_serial_number;
    }

    public void setInventory_serial_number(long inventory_serial_number) {
        this.inventory_serial_number = inventory_serial_number;
    }

    public String getInventory_type() {
        return inventory_type;
    }

    public void setInventory_type(String inventory_type) {
        this.inventory_type = inventory_type;
    }

    public String getInventory_brand() {
        return inventory_brand;
    }

    public void setInventory_brand(String inventory_brand) {
        this.inventory_brand = inventory_brand;
    }

    public String getInventory_model() {
        return inventory_model;
    }

    public void setInventory_model(String inventory_model) {
        this.inventory_model = inventory_model;
    }

    public LocalDate getInventory_entry_date() {
        return inventory_entry_date;
    }

    public void setInventory_entry_date(LocalDate inventory_entry_date) {
        this.inventory_entry_date = inventory_entry_date;
    }

    public String getInventory_situation() {
        return inventory_situation;
    }

    public void setInventory_situation(String inventory_situation) {
        this.inventory_situation = inventory_situation;
    }




}
