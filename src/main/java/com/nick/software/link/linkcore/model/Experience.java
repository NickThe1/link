package com.nick.software.link.linkcore.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Experience extends BaseEntity{
    @Size(min = 2, max = 100, message = "Length must be between 2 and 100.")
    private String posotion;

    @Size(min = 2, max = 30, message = "Length must be between 2 and 30.")
    private String companyName;

    @Size(min = 0, max = 500, message = "Length must be between 0 and 500.")
    private String information;

    public Experience() {
    }

    public Experience(@Size(min = 2, max = 100, message = "Length must be between 2 and 100.") String posotion, @Size(min = 2, max = 30, message = "Length must be between 2 and 30.") String companyName, @Size(min = 0, max = 500, message = "Length must be between 0 and 500.") String information) {
        this.posotion = posotion;
        this.companyName = companyName;
        this.information = information;
    }

    public String getPosotion() {
        return posotion;
    }

    public void setPosotion(String posotion) {
        this.posotion = posotion;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return Objects.equals(posotion, that.posotion) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(information, that.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posotion, companyName, information);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "posotion='" + posotion + '\'' +
                ", companyName='" + companyName + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
