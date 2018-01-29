package net.ko4erev.springsecurityapp.Service;

/**
 * Service for Security.
 *
 * @author Kocherev Alexei
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
