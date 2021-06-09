package com.in48iliass.challenge.backendcodding.feign;

import com.in48iliass.challenge.backendcodding.model.GithubRepository;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@FeignClient(name = "github",url="https://api.github.com",fallbackFactory = HystrixClientFallback.class)
public interface BackendCodingServiceProxy {


@GetMapping("/search/repositories?q=created:>{date}&sort=stars&order=desc&per_page=100")
 GithubRepository retriveRepositories(@PathVariable String date);

}
 class HystrixClientFallback implements FallbackFactory<BackendCodingServiceProxy> {


     @Override
     public BackendCodingServiceProxy create(Throwable throwable) {
         return ( String date) -> null;
     }
 }
