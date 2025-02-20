package io.research.research_assistant.controller;

import lombok.AllArgsConstructor;
import io.research.research_assistant.entity.ResearchRequest;
import io.research.research_assistant.service.ResearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResearchController {
    private final ResearchService researchService;

    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result = researchService.processContent(request);
        System.out.println("Summary request hit");
        return ResponseEntity.ok(result);
    }
}
