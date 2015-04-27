package com.my.app.web.websocket.dto;

import com.my.app.web.common.dto.CommonDto;

public class Greeting extends CommonDto {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

}
