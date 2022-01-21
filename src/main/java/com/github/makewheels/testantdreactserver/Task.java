package com.github.makewheels.testantdreactserver;

import lombok.Data;

import java.util.Date;

@Data
public class Task {
    private String taskId;
    private String title;
    private Date createTime;
}
