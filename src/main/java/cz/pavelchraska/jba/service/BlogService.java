package cz.pavelchraska.jba.service;

import cz.pavelchraska.jba.entity.Blog;
import org.springframework.stereotype.Service;

/**
 * Created by Pajut on 7.11.2016.
 */


public interface BlogService {
    void save(Blog blog, String name);

    void delete(Blog blog);

    Blog findOne(int id);
}
