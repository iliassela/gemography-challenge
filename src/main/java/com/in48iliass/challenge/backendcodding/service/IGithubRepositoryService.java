package com.in48iliass.challenge.backendcodding.service;

import com.google.common.collect.Multimap;
import com.in48iliass.challenge.backendcodding.dto.GithubRepositoryDto;


public interface IGithubRepositoryService {
    Multimap<String,GithubRepositoryDto> getAllLanguages();
}
