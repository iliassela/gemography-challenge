package com.in48iliass.challenge.backendcodding.model;

import com.in48iliass.challenge.backendcodding.dto.GithubRepositoryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
public class LanguageDetails {
    private int num_repository;
    private List<GithubRepositoryDto> githubRepositoryDtos;
}
