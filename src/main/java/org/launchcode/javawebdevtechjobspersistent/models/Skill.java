package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "Skill is required")
    @Size(min = 3, max = 150, message = "Skill must be between 3 and 150 characters")
    private String skill;

    public Skill() {}

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}