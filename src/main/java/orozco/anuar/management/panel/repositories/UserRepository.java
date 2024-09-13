package orozco.anuar.management.panel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import orozco.anuar.management.panel.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {



}
