package com.fuse;

import io.micronaut.json.JsonMapper;
import io.micronaut.serde.ObjectMapper;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.inject.Singleton;

@Singleton
public class LspMessageService {

    private Integer contentLength;
    private String contentType;
    private LspContent lspContent;

    public LspMessage(Integer length, String type, Object content) {
        this.contentLength = length;
        this.contentType = type;
        this.lspContent = new LspContent();
        lspContent.
    }
}
