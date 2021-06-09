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
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class GithubRepositoryService implements IGithubRepositoryService {
@Autowired
private BackendCodingServiceProxy proxy;
    @Override
    public Multimap<String,GithubRepositoryDto> getAllLanguages()  {
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date today30 = cal.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(today30);
        GithubRepository githubRepository = proxy.retriveRepositories(strDate);

        Multimap<String, GithubRepositoryDto> domains = ArrayListMultimap.create();
       if(githubRepository != null) {
           for (Item item : githubRepository.getItems()) {
               if (item.getLanguage() != null)
                   domains.put(item.getLanguage().toLowerCase(), GithubRepositoryDto.fromItem(item));
           }

       }
       return domains;
    }



}
