package com.nick.software.link.linkcore.repository;

import com.nick.software.link.linkcore.model.Account;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);

    @EntityGraph(value = "resume")
    Account findResumeByUsername(String username);
}
