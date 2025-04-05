package me.pleaseaihelp.mvp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.pleaseaihelp.mvp.model.LanguageLevel;

public interface LanguageLevelRepository extends JpaRepository<LanguageLevel, Integer> {
}