package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.kn.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
