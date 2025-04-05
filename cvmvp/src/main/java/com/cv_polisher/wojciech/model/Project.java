package com.cv_polisher.wojciech.model;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String projectTitle;
    private String description;
    private List<String> technologies = new ArrayList<>();
    private String projectURL;
    private java.time.YearMonth startDate;
    private java.time.YearMonth endDate;
    
    public Project() {
    }

    public Project(String projectTitle, String description, YearMonth startDate) {
        this.projectTitle = projectTitle;
        this.description = description;
        this.startDate = startDate;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public void setProjectURL(String projectURL) {
        this.projectURL = projectURL;
    }

    public java.time.YearMonth getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.YearMonth startDate) {
        this.startDate = startDate;
    }

    public java.time.YearMonth getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.YearMonth endDate) {
        this.endDate = endDate;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public void addTechnology(String technology) {
        if (technology != null && !technology.trim().isEmpty()) {
            this.technologies.add(technology);
        }
    }

    
}
