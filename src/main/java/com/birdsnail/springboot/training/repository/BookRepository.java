package com.birdsnail.springboot.training.repository;

import com.birdsnail.springboot.training.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author BirdSnail
 * @date 2019/12/17
 */
public interface BookRepository extends CrudRepository<Book,Long> {

    /**
     * 查找所有的包含title的book
     * @param title book title
     * @return book list
     */
    List<Book> findByTitle(String title);
}
