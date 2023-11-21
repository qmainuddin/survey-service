package com.example.surveyservice.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Survey extends BaseEntity {
    private String title;
    private String description;
    private String feedback;
    private String url;

}
