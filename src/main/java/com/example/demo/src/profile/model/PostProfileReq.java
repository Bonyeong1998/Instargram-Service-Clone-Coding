package com.example.demo.src.profile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostProfileReq {
    private String profileUserID;
    private String profileUserPW;
    private String profileEmail;
}
