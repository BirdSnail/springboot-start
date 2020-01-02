package com.bilibili.springboot.learning.model.yml;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FamilyTest {

    @Autowired
    private Family family;

    @Test
    void testFamilyInstance() {
        System.out.println(family);
        assertEquals("one", family.getMather().getAlias()[0]);
    }

}