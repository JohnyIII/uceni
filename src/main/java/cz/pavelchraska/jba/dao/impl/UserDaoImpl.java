package cz.pavelchraska.jba.dao.impl;

import cz.pavelchraska.jba.dao.UserDao;
import cz.pavelchraska.jba.entity.User;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao
{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User getById(final Integer id)
    {
        Session session = entityManager.unwrap(Session.class);

        return (User) session.createCriteria(User.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    @Transactional
    public User getByNamedQuery(final Integer id)
    {
        return (User) entityManager.createNamedQuery("User.getById")
                .setParameter("id", id)
                .getSingleResult();
    }
}
