package com.example.surveyservice.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

///**
// * DTO for {@link com.miu.alumnimanagementportal.entities.Survey}
// */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SurveyDto implements Serializable {
    private Long id;
    private Long version;
//    private Date createdDate;
//
//    private Date lastModifiedDate;
    @NotNull
    @NotEmpty
    @NotBlank
    private String title;
    @NotNull
    @NotEmpty
    @NotBlank
    private String description;
    private String feedback;
    @NotNull
    @NotEmpty
    @NotBlank
    private String url;
}
