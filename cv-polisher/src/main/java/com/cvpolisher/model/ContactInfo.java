package com.cvpolisher.model;

public class ContactInfo {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String location;
    private String linkedInUrl;
    private String gitHubUrl;
    private String anyUrl;

    public ContactInfo(String fullName, String email, String phoneNumber, String location){
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
}
