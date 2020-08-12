package com.trans.service.springbootrewards.rewards;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trans.service.springbootrewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
