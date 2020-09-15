package com.nick.software.link.linkcore.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.awt.*;

@Entity
public class AccountDetails extends BaseEntity {
    @Size(min = 5, max = 30, message = "Length must be between 5 and 30.")
    private String phone;

    @Size(min = 5, max = 30, message = "Length must be between 5 and 30.")
    private String currentPosition;

    @Size(min = 0, max = 300, message = "Length must be between 0 and 300.")
    private String biography;

    @Size(min = 0, max = 300, message = "Length must be between 5 and 30.")
    private String technologies;
}
