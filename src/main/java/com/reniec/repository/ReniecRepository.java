package com.reniec.repository;

import org.springframework.data.repository.CrudRepository;

import com.reniec.entity.Reniec;


public interface ReniecRepository extends CrudRepository<Reniec, Long>{
	Reniec findBydni(Long dni);
}
