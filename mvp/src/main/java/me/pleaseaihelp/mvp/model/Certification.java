package com.cvpolisher.model;

public class Certification {
    private String certificateName;
    private String issuedBy;
    private java.time.YearMonth date;
    private String description;
    
    public Certification(String certificateName, String issuedBy) {
        this.certificateName = certificateName;
        this.issuedBy = issuedBy;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public java.time.YearMonth getDate() {
        return date;
    }

    public void setDate(java.time.YearMonth date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
