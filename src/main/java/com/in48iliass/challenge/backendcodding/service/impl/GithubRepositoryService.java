package com.in48iliass.challenge.backendcodding.service.impl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.in48iliass.challenge.backendcodding.dto.GithubRepositoryDto;
import com.in48iliass.challenge.backendcodding.feign.BackendCodingServiceProxy;
import com.in48iliass.challenge.backendcodding.model.GithubRepository;
import com.in48iliass.challenge.backendcodding.model.Item;
import com.in48iliass.challenge.backendcodding.service.IGithubRepositoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import javax.annotation.Nullable;
import java.util.*;


@Service
public class GithubRepositoryService implements IGithubRepositoryService {
@Autowired
private BackendCodingServiceProxy proxy;
    @Override
    public Multimap<String,GithubRepositoryDto> getAllLanguages()  {
        GithubRepository githubRepository = proxy.retriveRepositories();

        Multimap<String, GithubRepositoryDto> domains = ArrayListMultimap.create();

        for(Item item:githubRepository.getItems()){
            if(item.getLanguage() != null)
                domains.put(item.getLanguage(),GithubRepositoryDto.fromItem(item));
        }
        return domains;
    }



}
