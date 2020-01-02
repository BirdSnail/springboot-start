package com.bilibili.springboot.learning.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    private Long id;

    private String author;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<Reader> reader;

}
