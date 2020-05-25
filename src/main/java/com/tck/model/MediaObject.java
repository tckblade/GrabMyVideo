package com.tck.model;

import javax.validation.constraints.NotEmpty;

public class MediaObject {
    @NotEmpty
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
