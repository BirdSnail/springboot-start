package com.bilibili.springboot.learning.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author BirdSnail
 * @date 2019/12/31
 */
@Data
@Builder
public class Article {

    private Long id;

    private String author;

    private String title;

    private String content;

    private Date createTime;


}
