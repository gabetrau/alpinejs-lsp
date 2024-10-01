package com.fuse;

import io.micronaut.serde.annotation.Serdeable;

public class LspMessage {

    private Integer contentLength;
    private String contentType;
    private LspContent LspContent;

    public LspMessage(Integer length, String type, Object content) {
    }
}
