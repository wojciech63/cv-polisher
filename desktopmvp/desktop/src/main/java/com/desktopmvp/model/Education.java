package com.desktopmvp.model;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table (name = "Education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT", nullable = "false")
    private long id;
    @Column(name = "field_of_study", columnDefinition = "TEXT")
    private String fieldOfStudy;
    @Column (name = "degree_title", columnDefinition = "TEXT")
    private String degreeTitle;
    @Column (name = "school_name", columnDefinition = "TEXT")
    private String schoolName;
    @Column (name = "location", columnDefinition = "TEXT")
    private String location;

    private LocalDate startDate;
    private LocalDate endDate;
    List<String> descriptionPoints = new ArrayList<>();

    public Education(String fieldOfStudy, String degreeTitle, String schoolName, String location, YearMonth startDate,
    YearMonth endDate) {
        this.fieldOfStudy = fieldOfStudy;
        this.degreeTitle = degreeTitle;
        this.schoolName = schoolName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }   

    
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
