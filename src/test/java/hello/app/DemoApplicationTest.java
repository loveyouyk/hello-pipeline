package hello.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoApplication.class})
@AutoConfigureMockMvc
public class DemoApplicationTest {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void exampleTest() throws Exception {
		this.mvc.perform(get("/hello")).andExpect(status().isOk())
				.andExpect(content().string("hello world"))
                .andDo(MockMvcResultHandlers.print());
	}

}
