package com.desktopmvp.model;
import java.time.YearMonth;
import java.util.*;
import jakarta.persistence.*;

@Entity
@Table (name = "WorkExperience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;
    @Column(name = "job_title", nullable = false, columnDefinition = "VARCHAR(255)")
    private String jobTitle;
    @Column(name = "company", nullable = false, columnDefinition = "VARCHAR(255)")
    private String companyName;
    @Column(name = " location", columnDefinition = "VARCHAR(255)")
    private String location;
    @Column(name = "start_date", nullable = false, columnDefinition = "DATE")
    private java.time.YearMonth startDate;
    @Column(name = "endDate", columnDefinition = "DATE")
    private java.time.YearMonth endDate;
    List<String> descriptionPoints = new ArrayList<>();
    @ManyToOne(optional = false)
    @JoinColumn(name = "contact_info_id", nullable = false,
    foreignKey = @ForeignKey(name = "fk_work_experience_contact_info"))
    private ContactInfo contactInfo;

    public WorkExperience() {
    }


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
