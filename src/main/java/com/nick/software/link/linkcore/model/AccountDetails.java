package com.nick.software.link.linkcore.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.Objects;
import java.util.Set;

@Entity
public class AccountDetails extends BaseEntity {
    @Size(min = 5, max = 30, message = "Length must be between 5 and 30.")
    private String phone;

    @Size(min = 5, max = 30, message = "Length must be between 5 and 30.")
    private String currentPosition;

    @Size(min = 0, max = 300, message = "Length must be between 0 and 300.")
    private String biography;

    @Size(min = 0, max = 300, message = "Length must be between 0 and 300.")
    private String technologies;

    @OneToMany
    private Set<Experience> experiences;

    public AccountDetails() {
    }

    public AccountDetails(@Size(min = 5, max = 30, message = "Length must be between 5 and 30.") String phone, @Size(min = 5, max = 30, message = "Length must be between 5 and 30.") String currentPosition, @Size(min = 0, max = 300, message = "Length must be between 0 and 300.") String biography, @Size(min = 0, max = 300, message = "Length must be between 5 and 30.") String technologies) {
        this.phone = phone;
        this.currentPosition = currentPosition;
        this.biography = biography;
        this.technologies = technologies;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountDetails that = (AccountDetails) o;
        return Objects.equals(phone, that.phone) &&
                Objects.equals(currentPosition, that.currentPosition) &&
                Objects.equals(biography, that.biography) &&
                Objects.equals(technologies, that.technologies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, currentPosition, biography, technologies);
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "phone='" + phone + '\'' +
                ", currentPosition='" + currentPosition + '\'' +
                ", biography='" + biography + '\'' +
                ", technologies='" + technologies + '\'' +
                '}';
    }
}
