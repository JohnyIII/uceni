package cz.pavelchraska.jba.repository;

import cz.pavelchraska.jba.entity.Blog;
import cz.pavelchraska.jba.entity.Item;
import cz.pavelchraska.jba.entity.Role;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Pajut on 1.11.2016.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByBlog(Blog blog, Pageable pageable);

}
