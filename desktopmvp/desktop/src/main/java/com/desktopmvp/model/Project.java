package com.desktopmvp.model;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectTitle;
    private String description;
    private List<String> technologies = new ArrayList<>();
    private String projectURL;
    private LocalDate startDate;
    private LocalDate endDate;
    
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
