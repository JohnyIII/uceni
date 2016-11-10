package cz.pavelchraska.jba.repository;

import cz.pavelchraska.jba.entity.Role;
import cz.pavelchraska.jba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pajut on 1.11.2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
