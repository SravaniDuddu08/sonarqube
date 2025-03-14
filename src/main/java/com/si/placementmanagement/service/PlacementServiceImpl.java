package com.si.placementmanagement.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.si.placementmanagement.entity.Placement;
import com.si.placementmanagement.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService {
	
	@Autowired
	PlacementRepository Pr;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return Pr.save(placement);
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return Pr.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return Pr.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		Pr.deleteById(id);
	}

	@Override
	public Placement updatePlacement(Long id, Placement placement) {
		// TODO Auto-generated method stub
		 Placement placementDB = Pr.findById(id).get();

		 if(Objects.nonNull(placement.getName()) &&
			       !"".equalsIgnoreCase(placement.getName())) {
			           placementDB.setName(placement.getName());
			       }

			       if(Objects.nonNull(placement.getQualification()) &&
			               !"".equalsIgnoreCase(placement.getQualification())) {
			           placementDB.setQualification(placement.getQualification());
			       }

			       if(Objects.nonNull(placement.getYear()) &&
			               !"".equals(placement.getYear())) {
			           placementDB.setYear(placement.getYear());
			       }

			     

	       return Pr.save(placementDB);
		
	}

}
