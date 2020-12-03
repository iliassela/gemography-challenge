package com.in48iliass.challenge.backendcodding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String name;
    private String full_name;
    private Owner owner;
    private String description;
    private String url;
    private String language;

}
