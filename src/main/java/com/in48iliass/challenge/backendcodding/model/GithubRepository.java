package com.in48iliass.challenge.backendcodding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepository {
    private Long total_count;
    private Boolean incomplete_results;
    private List<Item> items;
}
