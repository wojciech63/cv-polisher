package com.cvpolisher;
import java.util.*;

import com.ContactInfo;

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
}
