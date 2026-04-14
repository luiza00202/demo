package com.example.demo.domain.entity;

import com.example.demo.model.TaskStatus;

import java.util.List;

public class Task {
   private String id;
   private String title;
   private String description;
   private Integer numberOfDays;
   private TaskStatus status;
   private Project project;
   private Member assignMember;
}
