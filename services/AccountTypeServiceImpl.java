package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.AccountType;
import com.example.jforce.demo.repository.AccountTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountTypeServiceImpl implements IAccountTypeService {
    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Override
    public List<AccountType> listAll(){
        return accountTypeRepository.findAll();
    }


    @Override
    public AccountType delete(@PathVariable Long id) {
        AccountType accountType = accountTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AccountType not exist with id :" + id));

        accountTypeRepository.delete(accountType);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return accountType;
    }

    @Override
    public AccountType insert(@RequestBody AccountType accountType) {
        accountTypeRepository.save(accountType);
        return accountType;
    }

    @Override
    public List<AccountType> insertAll(@RequestBody List<AccountType> newAccountTypeList ) {
        accountTypeRepository.saveAll(newAccountTypeList);

        return newAccountTypeList;
    }

    @Override
    public AccountType update(Long id, @RequestBody AccountType accountType) {
        AccountType accountTypes = accountTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AccountType not exist with id :" + id));

        accountTypes.setAccount_type_name(accountType.getAccount_type_name());

        AccountType updatedAccountType = accountTypeRepository.save(accountType);
        return updatedAccountType;
    }


}
