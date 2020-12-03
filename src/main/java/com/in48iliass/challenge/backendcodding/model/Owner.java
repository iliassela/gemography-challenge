package com.in48iliass.challenge.backendcodding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    private String login;
    private String avatar_url;
    private String url;

}
