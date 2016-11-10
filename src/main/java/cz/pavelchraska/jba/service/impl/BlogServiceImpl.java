package cz.pavelchraska.jba.service.impl;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.User;
import cz.pavelchraska.jba.repository.BlogRepository;
import cz.pavelchraska.jba.repository.UserRepository;
import cz.pavelchraska.jba.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by Pajut on 7.11.2016.
 */

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    public void save(Blog blog, String name) {
        User user = userRepository.findByName(name);
        blog.setUser(user);
        blogRepository.save(blog);
    }

    @PreAuthorize("#blog.user.name ==authentication.name or hasRole('ADMIN')")
    public void delete(@P("blog")Blog blog) {
        blogRepository.delete(blog);

    }

    public Blog findOne(int id) {
        return blogRepository.findOne(id);
    }
}
