package com.accenture.javacapabilty;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.service.ProjectService;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProjectServiceTest extends TestCase {
    
    @Autowired
    ProjectService projectService;
    
    @Mock
    Project mocked;
    
    @BeforeAll
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
    
    @BeforeEach
    public void displayName(TestInfo testInfo) {
        System.out.println("Beggining test: " + testInfo.getDisplayName()  );
    }
    
    @Test
    @DisplayName("Create new project")
    public void testCreateNewProjectById() {
        
        when(mocked.getId()).thenReturn(10l);
    }
}
