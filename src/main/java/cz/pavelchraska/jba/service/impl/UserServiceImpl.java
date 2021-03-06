package cz.pavelchraska.jba.service.impl;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.Item;
import cz.pavelchraska.jba.entity.Role;
import cz.pavelchraska.jba.entity.User;
import cz.pavelchraska.jba.repository.BlogRepository;
import cz.pavelchraska.jba.repository.ItemRepository;
import cz.pavelchraska.jba.repository.RoleRepository;
import cz.pavelchraska.jba.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements cz.pavelchraska.jba.service.UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private RoleRepository roleRepository;

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findOne(int id) {
        return userRepository.findOne(id);
    }

    @Transactional
    public User findOneWithBlogs(int id) {
        User user = findOne(id);
        List<Blog> blogs = blogRepository.findByUser(user);
        for (Blog blog : blogs) {

            List<Item> items = itemRepository.findByBlog(blog, new PageRequest(0, 10, Sort.Direction.DESC, "publishedDate"));
            blog.setItems(items);
        }
        user.setBlogs(blogs);
        return user;
    }

    public void save(User user) {
        user.setEnabled(true);
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        List<Role> roles = new ArrayList<Role>();
        roles.add(roleRepository.findById(1));
        user.setRoles(roles);
        userRepository.save(user);
    }

    public User findOneWithBlogs(String name) {
       User user= userRepository.findByName(name);
        return findOneWithBlogs(user.getId());
    }

    public void delete(int id) {
        userRepository.delete(id);
    }
}
