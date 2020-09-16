package com.nick.software.link.linkcore.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

@Entity
public class Post extends BaseEntity{
    @Size(min = 1, max = 100, message = "Length must be between 1 and 100.")
    @Column(nullable = false)
    private String title;

    @Size(min = 1, max = 300, message = "Length must be between 1 and 300.")
    @Column(nullable = false)
    private String description;

    @Size(min = 1, max = 10_000, message = "Length must be between 1 and 10000.")
    @Column(nullable = false)
    private String article;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Comment> comments;

    public Post() {
    }

    public Post(@Size(min = 1, max = 100, message = "Length must be between 1 and 100.") String title, @Size(min = 1, max = 300, message = "Length must be between 1 and 300.") String description, @Size(min = 1, max = 10_000, message = "Length must be between 1 and 10000.") String article) {
        this.title = title;
        this.description = description;
        this.article = article;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return title.equals(post.title) &&
                description.equals(post.description) &&
                article.equals(post.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, article);
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", article='" + article + '\'' +
                '}';
    }
}
