package com.example.jforce.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_type")
public class AccountType {

    @Id
    @Column(name = "account_type_id")
    private long account_type_id;

    @Column(name = "account_type_name")
    private String account_type_name;

    public AccountType(long account_type_id, String account_type_name) {
        this.account_type_id = account_type_id;
        this.account_type_name = account_type_name;
    }

    public AccountType() {

    }

    public long getAccount_type_id() {
        return account_type_id;
    }

    public void setAccount_type_id(long account_type_id) {
        this.account_type_id = account_type_id;
    }

    public String getAccount_type_name() {
        return account_type_name;
    }

    public void setAccount_type_name(String account_type_name) {
        this.account_type_name = account_type_name;
    }

}
