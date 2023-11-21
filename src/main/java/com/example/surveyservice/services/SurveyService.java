package com.example.surveyservice.services;


import com.example.surveyservice.dtos.SurveyDto;

import java.util.List;

public interface SurveyService {
    SurveyDto create(SurveyDto surveyDto);


    List<SurveyDto> findAll();

    SurveyDto update(SurveyDto surveyDto, Long id);

    SurveyDto getSurveyById(Long id);

    void delete(Long id);
}

