package com.example.fcm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {
    private String targetToken;
    private String title;
    private String body;
}