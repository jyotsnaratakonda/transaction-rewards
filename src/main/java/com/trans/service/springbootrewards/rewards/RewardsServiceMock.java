package com.trans.service.springbootrewards.rewards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.trans.service.springbootrewards.model.Customer;
import com.trans.service.springbootrewards.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class RewardsServiceMock {

	private static List<Transaction> transactions = new ArrayList<Transaction>();
	private static long index;
	
	static {
		
		transactions.add( new Transaction(index++, new Customer(1, "Marco"), 100.0, "Purchase 1", new Date()) );
		transactions.add( new Transaction(index++, new Customer(2, "Luis"), 50.0, "Purchase 2", new Date()) );
		transactions.add( new Transaction(index++, new Customer(3, "Karla"), 120.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<Transaction> getAll() {
		return transactions;
	}
	
}
