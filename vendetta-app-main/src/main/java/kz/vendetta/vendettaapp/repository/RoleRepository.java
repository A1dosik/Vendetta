package kz.vendetta.vendettaapp.repository;

import kz.vendetta.vendettaapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
