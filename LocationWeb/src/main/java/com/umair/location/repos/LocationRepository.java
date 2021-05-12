package com.umair.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umair.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
