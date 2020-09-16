package com.nick.software.link.linkcore.service;

import com.nick.software.link.linkcore.dto.RegistrationDTO;
import com.nick.software.link.linkcore.dto.ResumeDTO;
import com.nick.software.link.linkcore.dto.mapper.RegistrationMapper;
import com.nick.software.link.linkcore.dto.mapper.ResumeMapper;
import com.nick.software.link.linkcore.model.Account;
import com.nick.software.link.linkcore.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public void registerAccount(RegistrationDTO registrationDTO){
        Account account = RegistrationMapper.INSTANCE.registrationDTOToAccount(registrationDTO);
        accountRepository.save(account);
    }

    public void setResume(ResumeDTO resumeDTO){
        Account account = ResumeMapper.INSTANCE.resumeDTOToAccount(resumeDTO);

    }

}
