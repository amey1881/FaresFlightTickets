package com.brownfield.pss.fares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.brownfield.pss.fares.entity.Fare;

@EnableJpaRepositories
public interface FaresRepository extends JpaRepository<Fare,Long> {
	Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
