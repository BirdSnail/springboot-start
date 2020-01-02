package com.bilibili.springboot.learning.model.yml;

import lombok.Data;

import java.util.List;

/**
 * @author BirdSnail
 * @date 2020/1/2
 */
@Data
public class Children {

    private String name;

    private int age;

    private List<Friend> friends;
}
