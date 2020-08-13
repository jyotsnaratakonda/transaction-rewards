package com.example.service.springbootrewards.rewards;

import com.trans.service.springbootrewards.model.Customer;
import com.trans.service.springbootrewards.rewards.RewardsService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
public class RewardsControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RewardsService service;

	@Mock
	List<Customer> customerLists;

	@Test
	public void getCustomers() throws Exception {
		when(service.getCustomerAll()).thenReturn(customerLists);
		this.mockMvc.perform(get("/customers")).andDo(print()).andExpect(status().isOk());
	}
}