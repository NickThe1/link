package com.nick.software.link.linkcore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Comment extends BaseEntity {
    @Size(min = 1, max = 500, message = "Length must be between 1 and 100.")
    @Column(nullable = false)
    private String text;

    @ManyToOne
    private Account account;

    public Comment() {
    }

    public Comment(@Size(min = 1, max = 500, message = "Length must be between 1 and 100.") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return text.equals(comment.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                '}';
    }
}
