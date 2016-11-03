package cz.pavelchraska.jba.repository;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Pajut on 1.11.2016.
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByUser(User user);

}
