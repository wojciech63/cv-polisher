package com.desktopmvp.model;

import javax.annotation.processing.Generated;

@Entity
@Table (name = "Certification")
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    private long id;
    @Column(name = "certificate_name", columnDefinition = "VARCHAR(255)")
    private String certificateName;
    @Column(name = "issuer", columnDefinition = "VARCHAR(255)")
    private String issuedBy;
    @Column(name = "date", columnDefinition = "DATE")
    private java.time.YearMonth date;
    @Column(name = "description", columnDefinition = )
    private String description;
    
    public Certification(String certificateName, String issuedBy) {
        this.certificateName = certificateName;
        this.issuedBy = issuedBy;
    }

    public Certification() {
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
