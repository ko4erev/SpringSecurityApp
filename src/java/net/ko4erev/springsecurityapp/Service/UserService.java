package net.ko4erev.springsecurityapp.Service;

import net.ko4erev.springsecurityapp.Model.User;

/**
 * Service class for {@link import net.ko4erev.springsecurityapp.Model.User}
 *
 * @author Kocherev Alexei
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
