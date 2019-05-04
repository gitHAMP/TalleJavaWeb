package com.hampcode.model.repository;

import java.util.Optional;

import com.hampcode.model.entity.Customer;

public interface ICustomerRepository extends IRepository<Customer>{
	Optional<Customer> findByDni(String dni) throws Exception;
}
