package com.cvpolisher.model;
import java.time.YearMonth;
import java.util.*;

public class WorkExperience {
    private String jobTitle;
    private String companyName;
    private String location;
    private java.time.YearMonth startDate;
    private java.time.YearMonth endDate;
    List<String> descriptionPoints = new ArrayList<>();

    public WorkExperience(String jobTitle, String companyName, String location, YearMonth startDate) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.startDate = startDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<String> getDescriptionPoints() {
        return descriptionPoints;
    }

    public void setDescriptionPoints(List<String> descriptionPoints) {
        this.descriptionPoints = descriptionPoints;
    }

    public void addDescriptionPoint(String point){
        if (point != null && !point.trim().isEmpty()){
            this.descriptionPoints.add(point);
        }
    }
}
