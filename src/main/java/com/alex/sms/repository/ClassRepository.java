package com.alex.sms.repository;

import org.springframework.data.repository.CrudRepository;

import com.alex.sms.model.Class;

public interface ClassRepository extends CrudRepository<Class, Integer> {
	Iterable<Class> findBySchoolYearId(Integer id);
	Iterable<Class> findByNameContaining(String name);
}
