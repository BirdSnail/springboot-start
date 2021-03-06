package com.bilibili.springboot.learning.controller;

import com.bilibili.springboot.learning.model.AjaxResponse;
import com.bilibili.springboot.learning.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author BirdSnail
 * @date 2019/12/31
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //增加一篇Article ，使用POST方法
    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        log.info("saveArticle：{}",article);
        return  AjaxResponse.success(article);
    }


    //删除一篇Article，使用DELETE方法，参数是id
    @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        log.info("deleteArticle：{}",id);
        return AjaxResponse.success(id);
    }

    //更新一篇Article，使用PUT方法，以id为主键进行更新
    @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        log.info("updateArticle：{}",article);
        return AjaxResponse.success(article);
    }

    //获取一篇Article，使用GET方法
    @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {

        Article article1 = Article.builder()
                .id(1L)
                .author("zimug")
                .content("spring boot 2.深入浅出")
                .createTime(new Date())
                .title("t1").build();
        return AjaxResponse.success(article1);
    }

}
