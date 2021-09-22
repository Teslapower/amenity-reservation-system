package de.misasoft.amenity_reservation_system.repos;

import de.misasoft.amenity_reservation_system.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
