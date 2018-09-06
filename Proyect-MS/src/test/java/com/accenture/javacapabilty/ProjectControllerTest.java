package com.accenture.javacapabilty;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.service.ProjectService;
import com.google.gson.Gson;
import java.util.Optional;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@AutoConfigureMockMvc
public class ProjectControllerTest {
    
    @Autowired
    MockMvc mockMvc;
    
    @MockBean
    ProjectService projectService;
    
    Gson gson = new Gson();
    
    @Test
    public void testControllerPost() throws Exception {
        
        Project created = new Project();
        
        String request = gson.toJson(created);
        
        when(projectService.createNewProject(created)).thenReturn(Optional.of(created));
        
        mockMvc.perform(
		post("/projects")
			.contentType(MediaType.APPLICATION_JSON)
			.content(request))
		.andExpect(status().isAccepted())
                .andExpect(content().string(request));
    }
}
