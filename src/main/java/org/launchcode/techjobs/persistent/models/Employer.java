package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @OneToMany
    @JoinColumn(name = "employer_id")  // The value of this parameter is the name of the foreign key column
   private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "please give a location")
    @Size(min = 2, max = 100, message = "location must be at in between 2 - 100")
    public String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){ };

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
