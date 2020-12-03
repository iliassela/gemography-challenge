package com.in48iliass.challenge.backendcodding.feign;

import com.in48iliass.challenge.backendcodding.model.GithubRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "github",url="https://api.github.com")
public interface BackendCodingServiceProxy {
// Hard coded for last 30 days : 2020-11-01 per-page=100 for 100 repository trending
@GetMapping("/search/repositories?q=created:>2020-11-01&sort=stars&order=desc&per_page=100")
    public GithubRepository retriveRepositories();

}