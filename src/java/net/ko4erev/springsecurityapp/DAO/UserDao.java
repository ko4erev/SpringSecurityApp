package net.ko4erev.springsecurityapp.DAO;

import net.ko4erev.springsecurityapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User,Long> {
    User findByUsername(String username);
}
