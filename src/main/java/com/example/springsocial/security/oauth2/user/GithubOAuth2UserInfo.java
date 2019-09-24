package com.example.springsocial.security.oauth2.user;

import java.util.Map;

public class GithubOAuth2UserInfo extends OAuth2UserInfo {

    public GithubOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("avatar_url");
    }
}