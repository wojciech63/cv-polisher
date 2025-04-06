package com.desktopmvp.model;
import jakarta.persistence.*;


@Entity
@Table(name = "contact_info")
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "location", columnDefinition = "TEXT")
    private String location;
    @Column(name = "picture_url", columnDefinition = "TEXT")
    private String pictureUrl;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "linkedin_url", columnDefinition = "TEXT")
    private String linkedInUrl;
    @Column(name = "github_url", columnDefinition = "TEXT")
    private String gitHubUrl;
    @Column(name = "any_url", columnDefinition = "TEXT")
    private String anyUrl;

    public ContactInfo() {
    }

    public ContactInfo(String fullName, String email, String phoneNumber, String location, String description, String pictureUrl){
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.description = description;
        this.pictureUrl = pictureUrl;
    }


    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLinkedInUrl(){
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl){
        this.linkedInUrl = linkedInUrl;
    }

    public String getGitHubUrl(){
        return gitHubUrl;
    }

    public void setGitHubUrl(String gitHubUrl){
        this.gitHubUrl = gitHubUrl;
    }

    public String getAnyUrl(){
        return anyUrl;
    }

    public void setAnyUrl(String anyUrl){
        this.anyUrl = anyUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "ContactInfo{" +
        "id = " + id +
        ", fullName = " + fullName +
        ", email = " + email +
        ", phoneNumber = " + phoneNumber +
        ", location = " + location + 
        ", pictureUrl = " + pictureUrl +
        ", description =" + description +
        ", linkedInUrl = "  + linkedInUrl +
        ", gitHubUrl = " + gitHubUrl +
        ", anyUrl = " + anyUrl + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
