package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "Skill is required")
    @Size(min = 3, max = 150, message = "Description must be between 3 and 150 characters")
    private String description;

    public Skill(@Size(min=3, max=150, message = "Description must be between 3 and 150 characters") String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}