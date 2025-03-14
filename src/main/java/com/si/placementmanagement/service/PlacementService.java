package com.si.placementmanagement.service;

import java.util.List;

import com.si.placementmanagement.entity.Placement;

public interface PlacementService {

	Placement savePlacement(Placement placement);

	List<Placement> fetchPlacementList();

	Placement fetchPlacementById(Long id);

	void deletePlacementById(Long id);


	Placement updatePlacement(Long id, Placement placement);

}
