package com.example.surveyservice.repositories;

import com.example.surveyservice.entities.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
