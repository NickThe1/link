package com.nick.software.link.linkcore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

@Entity
public class Account extends BaseEntity{
    @Size(min = 5, max = 30, message = "Length must be between 5 and 30.")
    @Column(unique = true, nullable = false)
    private String username;

    @Size(min = 2, max = 20, message = "Length must be between 2 and 20.")
    @Column(nullable = false)
    private String firstName;

    @Size(min = 2, max = 20, message = "Length must be between 2 and 20.")
    @Column(nullable = false)
    private String lastName;

    @Size(min = 5, max = 40, message = "Length must be between 5 and 40.")
    @Email(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")
    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 10, max = 255, message = "Length must be between 10 and 255.")
    @Column(nullable = false)
    private String password;

    @OneToOne
    private AccountDetails accountDetails;

    @OneToMany
    private Set<Post> posts;

    public Account() {
    }

    public Account(@Size(min = 5, max = 30, message = "Length must be between 5 and 30.") String username, @Size(min = 2, max = 20, message = "Length must be between 2 and 20.") String firstName, @Size(min = 2, max = 20, message = "Length must be between 2 and 20.") String lastName, @Size(min = 5, max = 40, message = "Length must be between 5 and 40.") @Email(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$") String email, @Size(min = 10, max = 255, message = "Length must be between 10 and 255.") String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return username.equals(account.username) &&
                firstName.equals(account.firstName) &&
                lastName.equals(account.lastName) &&
                email.equals(account.email) &&
                password.equals(account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastName, email, password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
