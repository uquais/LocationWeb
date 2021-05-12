package com.umair.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.umair.location.entities.Location;
import com.umair.location.service.LocationService;
import com.umair.location.util.EmailUtil;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService service;
	
	@Autowired
	EmailUtil emailutil;
	
	@RequestMapping("/showcreate")
	public String showCreate() {
		return "createLocation";
	}
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		Location locationsaved = service.saveLocation(location);
		String msg="Location Saved with id "+ locationsaved.getId();
		modelmap.addAttribute("msg", msg);
		emailutil.sendEmail("springlearn11@gmail.com", "my subject is from Spring", "this is spring n"+ locationsaved.getId());
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelmap) {
		List<Location> Locations = service.getAllLocation();
		modelmap.addAttribute("locations", Locations);
		return "displayLocations";	
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelmap) {
		Location location= service.getLocationById(id);
		service.deleteLocation(location);
		List<Location> locations=service.getAllLocation();
		modelmap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelmap) {
		Location location=service.getLocationById(id);
		modelmap.addAttribute("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelmap)
	{
		service.updateLocation(location);
		List<Location> locations= service.getAllLocation();
		modelmap.addAttribute("locations", locations);
		return "displayLocations";
	}
	

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

