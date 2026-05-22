package com.bnp.service;

import com.bnp.dto.AccountDTO;
import com.bnp.dto.updateAccountDTO;
import com.bnp.execption.UserNotFoundException;
import com.bnp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class AccountServiceImpl implements AccountService{

    private final List<AccountDTO> accounts = new ArrayList<>();

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        AccountDTO newAccount = new AccountDTO();
        newAccount.setId(UUID.randomUUID());
        newAccount.setAccountNumber(UUID.randomUUID().toString());
        newAccount.setAccountType(accountDTO.getAccountType());
        newAccount.setBalance(0.0);
        newAccount.setAccountHolderName(accountDTO.getAccountHolderName());
        newAccount.setAccountHolderPhone(accountDTO.getAccountHolderPhone());
        newAccount.setAccountHolderEmail(accountDTO.getAccountHolderEmail());
        accounts.add(newAccount);
        return newAccount;
    }


    @Override
    public AccountDTO updateAccount(updateAccountDTO accountDTO, UUID id) {
        AccountDTO account = new AccountDTO();
        account = getAccount(id);
        if (account != null) {
            account.setAccountHolderName(accountDTO.getAccountHolderName());
            account.setAccountHolderEmail(accountDTO.getAccountHolderEmail());
            account.setAccountHolderPhone(accountDTO.getAccountHolderPhone());
            account.setAccountType(accountDTO.getAccountType());
            accounts.add(account);
            return account;
        }
        else {
            throw new UserNotFoundException("Account with id " + id + " not found");
        }
    }

    @Override
    public AccountDTO deleteAccount(UUID id) {
       AccountDTO account = new AccountDTO();
        account = getAccount(id);
        if (account != null) {
            accounts.remove(account);
            return account;
        }
        else {
            throw new UserNotFoundException("Account with id " + id + " not found");
        }
    }

    @Override
    public AccountDTO getAccount(UUID id) {
        AccountDTO account = new AccountDTO();
        account =  accounts.stream().filter(account1 -> account1.getId().equals(id)).findFirst().orElse(null);
        if (account != null) {
            return account;
        } else {
            throw new UserNotFoundException("Account with id " + id + " not found");
        }
    }

    @Override
    public List<AccountDTO> getAccounts() {
        return accounts;
    }
}
