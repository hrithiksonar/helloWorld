package com.jenkins.helloWorld;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testApi() throws Exception {
		System.out.println("Testing of API working...");
		mockMvc.perform(MockMvcRequestBuilders.get("/greet").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
	}

}
