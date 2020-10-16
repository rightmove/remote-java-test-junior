package com.rightmove.property;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

	private final PropertyService propertyService;

	public PropertyController(PropertyService propertyService) {
		this.propertyService = propertyService;
	}

	@GetMapping("/property")
	public PropertyResult getProperties(@RequestParam String postcode) {
		return new PropertyResult(propertyService.search(postcode));
	}
}
