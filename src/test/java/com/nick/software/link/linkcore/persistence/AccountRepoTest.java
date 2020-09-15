package com.nick.software.link.linkcore.persistence;

import com.nick.software.link.linkcore.model.Account;
import com.nick.software.link.linkcore.repository.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepoTest {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void saveAccount(){
        Account account = new Account("username", "nick", "testov", "test@mail.ru", "43143124321");

        accountRepository.save(account);
        Account account1 = accountRepository.findByUsername(account.getUsername());

        Assert.assertEquals(account, account1);
    }
}
