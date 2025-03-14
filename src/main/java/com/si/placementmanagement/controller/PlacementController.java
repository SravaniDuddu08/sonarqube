package com.si.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.placementmanagement.entity.*;
import com.si.placementmanagement.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	 private PlacementService Ps;
	
	
	 @PostMapping("/placements")
	    public Placement savePlacement(@RequestBody Placement placement) {
	       
	        return Ps.savePlacement(placement);
	    }
	    

	    @GetMapping("/placements")
	    public List<Placement> fetchPlacementList() {
	        //LOGGER.info("Inside fetchPlacementList of PlacementController");
	        return Ps.fetchPlacementList();
	    }
	    


	    @GetMapping("/placements/{id}")
	    
	    public Placement fetchPlacementById(@PathVariable("id") Long Id)
	            {
	        return Ps.fetchPlacementById(Id);
	    }
	    
	    @DeleteMapping("/placements/{id}")
	    public String deletePlacementById(@PathVariable("id") Long Id) {
	            Ps.deletePlacementById(Id);
	        return "Placement is deleted Successfully!!";
	    }
	    
	    @PutMapping("/placements/{id}")
	    public Placement updatePlacement(@PathVariable("id") Long Id,
	                                       @RequestBody Placement placement) {
	        return Ps.updatePlacement(Id,placement);
	    }
}
