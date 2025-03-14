package com.si.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.placementmanagement.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {

}
