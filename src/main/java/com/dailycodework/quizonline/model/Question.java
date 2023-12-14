package com.dailycodework.quizonline.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Simpson Alfred
 */
@Getter
@Setter
@Entity
public class Question {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String question;
    @NotBlank
    private String subject;
    @NotBlank
    private String questionType;


    @ElementCollection
    private List<String> choices;


    @ElementCollection
    private List<String> correctAnswers;
}
