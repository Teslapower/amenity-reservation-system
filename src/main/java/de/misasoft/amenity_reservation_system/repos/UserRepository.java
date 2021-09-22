package de.misasoft.amenity_reservation_system.repos;

import de.misasoft.amenity_reservation_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
