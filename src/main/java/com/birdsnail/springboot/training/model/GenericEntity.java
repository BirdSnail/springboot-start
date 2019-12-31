package com.birdsnail.springboot.training.model;

import lombok.Data;

/**
 * @author BirdSnail
 * @date 2019/12/17
 */
@Data
public class GenericEntity {
    private long id;

    private String value;

    public GenericEntity(long id, String value) {
        this.id = id;
        this.value = value;
    }
}
