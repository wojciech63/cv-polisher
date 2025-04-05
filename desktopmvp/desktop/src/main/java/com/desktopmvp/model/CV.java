package com.desktopmvp.model;
import java.util.*;

import com.desktopmvp.ContactInfo;

public class CV {
    private ContactInfo contactInfo;
    private String professionalSummary;
    private String photoFieldPath;
    private List<WorkExperience> workExperiences = new ArrayList<>();
    private List<Education> educationHistory = new ArrayList<>();
    private Map<String, List<String>> skills = new HashMap<>();
    private List<LanguageLevel> languages = new ArrayList<>();
    private List<Certification> certifications = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    
    public CV() {
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getProfessionalSummary() {
        return professionalSummary;
    }

    public void setProfessionalSummary(String professionalSummary) {
        this.professionalSummary = professionalSummary;
    }

    public String getPhotoFieldPath() {
        return photoFieldPath;
    }

    public void setPhotoFieldPath(String photoFieldPath) {
        this.photoFieldPath = photoFieldPath;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<Education> getEducationHistory() {
        return educationHistory;
    }

    public void setEducationHistory(List<Education> educationHistory) {
        this.educationHistory = educationHistory;
    }

    public Map<String, List<String>> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, List<String>> skills) {
        this.skills = skills;
    }

    public List<LanguageLevel> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguageLevel> languages) {
        this.languages = languages;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addWorkExperience(WorkExperience experience){
        if (experience != null){
            workExperiences.add(experience);
        }
    }

    public void addEducation(Education education){
        if (education != null){
            educationHistory.add(education);
        }
    }

    public void addLanguage(LanguageLevel language){
        if (language != null){
            languages.add(language);
        }
    }

    public void addCertification(Certification certification){
        if (certification != null){
            certifications.add(certification);
        }
    }

    public void addProject(Project project){
        if (project != null){
            projects.add(project);
        }
    }

    
}
