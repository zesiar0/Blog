package com.springboot.blog.queryvo;

import com.springboot.blog.entity.Type;

import java.util.Date;

public class BlogQuery {
    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;
}
