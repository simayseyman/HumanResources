package com.example.jforce.demo;

import com.example.jforce.demo.entity.AccountType;
import com.example.jforce.demo.services.IAccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DemoAccountTypeRestServices {
    @Autowired
    private IAccountTypeService accountTypeService;

    @GetMapping(path = "/getAccountTypes")
    public List<AccountType> getAccountTypes(){

        return accountTypeService.listAll();
    }

    @DeleteMapping(path = "/deleteAccountType/{id}")
    public AccountType deleteAccountType(@PathVariable(name = "id") Long id ) {
        return accountTypeService.delete(id);
    }

    @PostMapping(path = "/addAccountType")
    public AccountType createAccountType(@RequestBody AccountType accountType) {
        return accountTypeService.insert(accountType);
    }

    @PostMapping(path = "/postAccountType")
    public List<AccountType> addAccountTypeAll(@RequestBody List<AccountType> newAccountTypeList) {
        return accountTypeService.insertAll(newAccountTypeList);
    }

    @PutMapping(path = "/accountType/{id}")
    public AccountType updateAccountType(@PathVariable(name = "id")Long id, @RequestBody AccountType accountType) {
        return accountTypeService.update(id, accountType);

    }
}
