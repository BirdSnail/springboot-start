package com.bilibili.springboot.learning.model.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author BirdSnail
 * @date 2020/1/2
 */
@Data
@Component
@ConfigurationProperties(prefix = "family")
public class Family {

    private String familyName;

    private Father father;

    private Mather mather;

    private Children children;

}
