package com.example.surveyservice.controllers;


import com.example.surveyservice.common.Converter;
import com.example.surveyservice.dtos.SurveyDto;
import com.example.surveyservice.services.SurveyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/surveys")
public class SurveyController {
    private final SurveyService surveyService;
    private final Converter converter;

    @PostMapping
    public ResponseEntity<?> createSurvey(@Valid @RequestBody SurveyDto surveyDto) {
        surveyService.create(surveyDto);
        return converter.buildReposeEntity(Map.of("message", "Survey created successfully"), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<?> getSurveyAll() {
        return converter.buildReposeEntity(Map.of("data", surveyService.findAll()), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSurveyById(@PathVariable Long id) {
        return converter.buildReposeEntity(Map.of("data", surveyService.getSurveyById(id)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSurveyById( @PathVariable Long id,@Valid @RequestBody SurveyDto surveyDto) {
        return converter.buildReposeEntity(Map.of("data", surveyService.update(surveyDto, id)), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSurveyById(@PathVariable Long id) {
        surveyService.delete(id);
        return converter.buildReposeEntity(Map.of("message", "Survey Deleted successfully"), HttpStatus.ACCEPTED);
    }


}

