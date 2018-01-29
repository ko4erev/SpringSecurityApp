package net.ko4erev.springsecurityapp.DAO;

import net.ko4erev.springsecurityapp.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
