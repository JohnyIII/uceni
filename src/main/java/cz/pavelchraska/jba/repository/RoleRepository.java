package cz.pavelchraska.jba.repository;

import cz.pavelchraska.jba.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pajut on 1.11.2016.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
    Role findById(int id);
}
