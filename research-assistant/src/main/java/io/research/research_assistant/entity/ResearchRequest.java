package io.research.research_assistant.entity;

import lombok.Data;

@Data
public class ResearchRequest {
    private String content;
    private String operation;
}
