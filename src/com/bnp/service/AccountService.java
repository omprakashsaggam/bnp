package com.bnp.service;

import com.bnp.dto.AccountDTO;
import com.bnp.dto.updateAccountDTO;

import java.util.List;
import java.util.UUID;

public interface AccountService {
    public AccountDTO createAccount(AccountDTO accountDTO);
    public AccountDTO updateAccount(updateAccountDTO accountDTO, UUID id);
    public AccountDTO deleteAccount(UUID id);
    public AccountDTO getAccount(UUID id);
    public List<AccountDTO> getAccounts();
}
