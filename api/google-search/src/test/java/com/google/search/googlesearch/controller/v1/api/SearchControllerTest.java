package com.google.search.googlesearch.controller.v1.api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class SearchControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@MockBean
	private SearchController searchController;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void searchResultv1Test() throws Exception {
		String response = "{\"total_results\":6,\"execution_time\":45000,\"query_string\":\"facebook\",\"results\":[{\"title\":\"Facebook - Log In or Sign Up\",\"url\":\"https://www.facebook.com/\",\"short_description\":\"Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates.\"},{\"title\":\"Facebook (@Facebook) · Twitter\",\"url\":\"https://twitter.com/Facebook\",\"short_description\":\"\"},{\"title\":\"Facebook – Apps on Google Play\",\"url\":\"https://play.google.com/store/apps/details?id=com.facebook.katana&hl=en_IN&gl=US\",\"short_description\":\"Keeping up with friends is faster and easier than ever. Share updates and photos, engage with friends and Pages, and stay connected to communities important ...\"},{\"title\":\"Newsroom | About Facebook\",\"url\":\"https://about.fb.com/news/\",\"short_description\":\"View the latest news, announcements and media resources from Facebook.\"},{\"title\":\"About Facebook\",\"url\":\"https://about.fb.com/\",\"short_description\":\"Facebook builds technologies that give people the power to connect with friends and family, find communities and grow businesses.\"},{\"title\":\"Facebook - Wikipedia\",\"url\":\"https://en.wikipedia.org/wiki/Facebook\",\"short_description\":\"Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ...\"}]}";
		when(searchController.searchResultv1("facebook")).thenReturn(response);
		
		mockMvc.perform(get("/v1/search").param("query","facebook").content(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(jsonPath("$.query_string").exists())
		.andExpect(jsonPath("$.results").exists())
		.andExpect(jsonPath("$.query_string").value("facebook"))
		.andExpect(status().isOk())
		.andReturn();
	}

}
