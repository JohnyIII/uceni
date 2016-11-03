package cz.pavelchraska;

import cz.pavelchraska.jba.dao.UserDao;
import cz.pavelchraska.jba.entity.User;
import cz.pavelchraska.jba.repository.UserRepository;
import cz.pavelchraska.jba.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext.xml")
public class UserTest
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserOneTest()
    {
        User user = userService.findOne(3);
        Assert.assertNotNull(user);
    }

    @Test
    public void getUserByIdTest()
    {
        User user = userDao.getById(3);
        Assert.assertNotNull(user);
    }

    @Test
    public void getUserByNamedQueryTest()
    {
        User user = userDao.getByNamedQuery(3);
        Assert.assertNotNull(user);
        Assert.assertEquals("Nesouhlasí jméno!", "admin", user.getName());
    }
}
