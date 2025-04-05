package com.desktopmvp.model;
public class LanguageLevel {
    private String language;
    private String languageLevel;
    
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
