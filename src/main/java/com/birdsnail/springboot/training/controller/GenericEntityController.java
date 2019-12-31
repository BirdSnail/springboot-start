package com.birdsnail.springboot.training.controller;

import com.birdsnail.springboot.training.model.GenericEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BirdSnail
 * @date 2019/12/17
 */
@RestController
public class GenericEntityController {

    private List<GenericEntity> entityList = new ArrayList<>();

    {
        entityList.add(new GenericEntity(1L, "entity-1"));
        entityList.add(new GenericEntity(2L, "entity-2"));
        entityList.add(new GenericEntity(3L, "entity-3"));
        entityList.add(new GenericEntity(4L, "entity-4"));
    }

    @RequestMapping("/entity/all")
    public List<GenericEntity> findAll() {
        return entityList;
    }

    @RequestMapping(value = "/entity", method = RequestMethod.POST)
    public GenericEntity addEntity(GenericEntity entity) {
        entityList.add(entity);
        return entity;
    }

    @RequestMapping("/entity/findby/{id}")
    public GenericEntity findEntityById(@PathVariable long id) {
        return entityList.stream()
                .filter(entity -> entity.getId() == id)
                .findFirst()
                .get();
    }

}
