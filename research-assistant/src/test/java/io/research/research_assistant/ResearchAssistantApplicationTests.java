package io.research.research_assistant;

import com.fasterxml.jackson.databind .ObjectMapper;
import io.research.research_assistant.entity.ResearchRequest;
import io.research.research_assistant.service.ResearchService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ResearchAssistantApplicationTests {

    @Value("${gemini.api.url}")
    private String geminiApiURL;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    @MockBean
    private WebClient.Builder webClientBuilder;

    @MockBean
    private ObjectMapper objectMapper;

    @InjectMocks
    private ResearchService researchService;

    @Mock
    private WebClient webClient;

    @Mock
    private WebClient.RequestBodyUriSpec requestBodyUriSpec;

    @Mock
    private WebClient.RequestBodySpec requestBodySpec;

    @Mock
    private WebClient.ResponseSpec responseSpec;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        when(webClientBuilder.build()).thenReturn(webClient);
        when(webClient.post()).thenReturn(requestBodyUriSpec);
        when(requestBodyUriSpec.uri(any(String.class))).thenReturn(requestBodySpec);
        when(requestBodySpec.bodyValue(any())).thenReturn(requestBodySpec);
        when(requestBodySpec.retrieve()).thenReturn(responseSpec);
        when(responseSpec.bodyToMono(String.class)).thenReturn(Mono.just("mocked response"));
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testProcessContent() {
        ResearchRequest request = new ResearchRequest();
        request.setOperation("summarize");
        request.setContent("This is a test content.");

        String result = researchService.processContent(request);

        assertEquals("mocked response", result);
    }
}