package com.reniec.restController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reniec.entity.Reniec;
import com.reniec.repository.ReniecRepository;


@RestController
@RequestMapping("/api")
public class ReniecController {
	
	@Autowired
	private ReniecRepository ReniecRepository;

	@GetMapping("/Reniec/{DNI}")
	public Reniec findByDNI(@PathVariable(value = "DNI") Long DNI) {
		return ReniecRepository.findBydni(DNI);
	}
	
}
