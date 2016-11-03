package cz.pavelchraska.jba.dao;

import cz.pavelchraska.jba.entity.User;

public interface UserDao
{
    User getById(Integer id);

    User getByNamedQuery(Integer id);
}
