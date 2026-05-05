package com.example.demo.applicationservice;

import com.example.demo.domain.entity.Project;
import com.example.demo.model.ProjectStatus;
import com.example.demo.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@RequiredArgsConstructor
public class ProjectService {

    private ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDTO saveProjectDataDTO){
        Project project = Project
                .builder()
                .name(saveProjectDataDTO.getName())
                .description(saveProjectData.getDescription())
                .initialDate(saveProjectData.getInitialDate())
                .finalDate(saveProjectData.getFinalDate())
                .status(ProjectStatus.PEDDING)
                .build();

        projectRepository.save(project);
        return project;
    }
}
