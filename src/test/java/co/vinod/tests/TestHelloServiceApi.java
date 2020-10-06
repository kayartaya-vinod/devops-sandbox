package co.vinod.tests;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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
public class TestHelloServiceApi {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testHelloService() throws Exception {
		String content = "{\"name\":\"Vinod\",\"message\":\"Hello, World!\"}";

		mvc.perform(MockMvcRequestBuilders.get("/api/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo(content)));
	}
}

// "{\"name\":\"Vinod\",\"message\":\"Hello, World!\"}"
// "{\"name\":\"Vinod\",\"message\":\"Hello, World!\"}"
