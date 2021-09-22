package de.misasoft.amenity_reservation_system.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("de.misasoft.amenity_reservation_system.domain")
@EnableJpaRepositories("de.misasoft.amenity_reservation_system.repos")
@EnableTransactionManagement
public class DomainConfig {
}
