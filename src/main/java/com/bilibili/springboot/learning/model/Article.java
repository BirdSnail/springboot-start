package com.bilibili.springboot.learning.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author BirdSnail
 * @date 2019/12/31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @JsonIgnore
    private Long id;

    private String author;

    private String title;

    private String content;

    private Date createTime;

    private List<Reader> reader;

}
