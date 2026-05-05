package com.example.demo.infrastructure.dto;

import com.example.demo.model.ProjectStatus;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
import com.example.demo.domain.entity.Project;
import com.example.demo.model.ProjectStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

public class SaveProjectDataDto {
    @Id
    private final String id;

    private final String name;
    private final String description;
    private final LocalDate initialDate;
    private final LocalDate finalDate;
    private final ProjectStatus status;

}
