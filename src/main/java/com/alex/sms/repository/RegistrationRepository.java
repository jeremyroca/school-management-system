package com.alex.sms.repository;

import org.springframework.data.repository.CrudRepository;

import com.alex.sms.model.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
	Iterable<Registration> findByCId(Integer id);
	Iterable<Registration> findFirst5ByOrderByTimestampDesc();
	Registration findByStudentId(Integer id);
}
