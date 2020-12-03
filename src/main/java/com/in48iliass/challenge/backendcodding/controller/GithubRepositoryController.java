package com.in48iliass.challenge.backendcodding.controller;

import com.in48iliass.challenge.backendcodding.dto.GithubRepositoryDto;
import com.in48iliass.challenge.backendcodding.model.LanguageDetails;
import com.in48iliass.challenge.backendcodding.service.IGithubRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class GithubRepositoryController {
@Autowired
private IGithubRepositoryService githubRepositoryService;

@GetMapping
public ResponseEntity<Set<String>>  getAllLanguages() {

    return ResponseEntity.ok(githubRepositoryService.getAllLanguages().keySet()) ;
}
    @GetMapping("/{language}")
public ResponseEntity<LanguageDetails>  getAllDetails(@PathVariable String language){
    List<GithubRepositoryDto> githubRepositoryDtos = new ArrayList<>(githubRepositoryService.getAllLanguages().get(language));
   return ResponseEntity.ok( new LanguageDetails(githubRepositoryDtos.size(),githubRepositoryDtos) );
}
}
