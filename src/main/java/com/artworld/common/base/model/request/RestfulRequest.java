package com.artworld.common.base.model.request;




public class RestfulRequest implements Request {
    private static final long serialVersionUID = -2363877433041183308L;

    private String   language="1";

    private String   token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
