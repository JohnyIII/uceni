package cz.pavelchraska.jba.service;

import cz.pavelchraska.jba.entity.User;
import java.util.List;

public interface UserService
{
    List<User> findAll();

    User findOne(int id);

    User findOneWithBlogs(int id);

    void save(User user);
}
