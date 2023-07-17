package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.AccountType;

import java.util.List;

public interface IAccountTypeService {
    List<AccountType> listAll();

    AccountType delete(Long id);

    AccountType insert(AccountType accountType);

    AccountType update(Long id, AccountType accountType);

    List<AccountType> insertAll(List<AccountType> newAccountTypeList);
}
