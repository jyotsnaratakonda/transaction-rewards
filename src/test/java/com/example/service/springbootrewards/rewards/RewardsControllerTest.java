package com.example.service.springbootrewards.rewards;

import com.trans.service.springbootrewards.model.Customer;
import com.trans.service.springbootrewards.rewards.CustomerRepository;
import com.trans.service.springbootrewards.rewards.RewardsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class RewardsControllerTest {
	
	@InjectMocks
	RestController restController;
	@Mock
	RewardsService rewardsService;
	@Mock
	List<Customer> customerList;

	@Test
	public void testCustomers()
	{
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(rewardsService.getCustomerAll()).thenReturn(customerList);



	}
	
}
