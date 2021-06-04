package com.in48iliass.challenge.backendcodding.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.in48iliass.challenge.backendcodding.model.Item;
import com.in48iliass.challenge.backendcodding.model.Owner;
import com.sun.istack.internal.NotNull;
import lombok.*;

import java.util.Objects;

@Data
@Builder

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GithubRepositoryDto {
    private String name;
    private String full_name;
    private String owner_login;
    private String description;
    private String url;
    private String avatar_url;
    private String owner_url;
    private String language;


    public static GithubRepositoryDto fromItem(final Item item){
return Objects.isNull(item) ? null : GithubRepositoryDto.builder()
        .name(item.getName())
        .full_name(item.getFull_name())
        .description(item.getDescription())
        .language(item.getLanguage())
        .url(item.getUrl())
        .owner_login(item.getOwner().getLogin())
        .avatar_url(item.getOwner().getAvatar_url())
        .build();
    }
}
