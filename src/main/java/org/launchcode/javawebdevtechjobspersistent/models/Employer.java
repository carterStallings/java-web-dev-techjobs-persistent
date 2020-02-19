package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 70, message = "Location must be between 3 and 70 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(@Size(min=3, max=70, message = "Location must be between 3 and 70 characters") String location) {
        this.location = location;
    }


    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
