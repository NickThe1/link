package com.nick.software.link.linkcore.dto;

import com.nick.software.link.linkcore.model.AccountDetails;

public class ResumeDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private AccountDetails accountDetails;

    public ResumeDTO() {
    }

    public ResumeDTO(String username, String firstName, String lastName, String email, AccountDetails accountDetails) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.accountDetails = accountDetails;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }
}
