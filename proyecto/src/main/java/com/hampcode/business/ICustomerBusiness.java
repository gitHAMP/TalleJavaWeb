package com.hampcode.business;

import java.util.Optional;

import com.hampcode.model.entity.Customer;

public interface ICustomerBusiness extends IBusiness<Customer> {
	Optional<Customer> findCustomerByDni(String dni) throws Exception;
}
