package com.cv_polisher.wojciech.model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class LanguageLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 25)
    private String language;

    @NotNull
    @Size(min = 1, max = 25)
    private String languageLevel;
    
    public LanguageLevel() {
    }

    public LanguageLevel(String language, String languageLevel) {
        this.language = language;
        this.languageLevel = languageLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(String languageLevel) {
        this.languageLevel = languageLevel;
    }

}
