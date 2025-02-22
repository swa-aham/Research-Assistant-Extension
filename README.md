# Research-Assistant-Extension

This is a Chrome extension that combines text summarization and note-taking to enhance research efficiency. The tool allows users to quickly condense lengthy content and capture key insights, streamlining the process of gathering and organizing information for easy reference.


![image](https://github.com/user-attachments/assets/3187d500-7f08-4845-b5f3-7fdcb1a9b2d5)
![image](https://github.com/user-attachments/assets/c374ea1f-9fac-47eb-9f6d-66d8fea27d62)

## Local setup steps

Requirements : JDK 11+, JRE 11+

- Clone this repo
- Go to your browser -> extension -> manage extension
- Turn on developer mode on top right corner
  
 ![image](https://github.com/user-attachments/assets/803399c3-c23a-4219-bf81-584af9256bf6)

- Click on "Load untracked" and select "Extension" folder from the repo
  
![image](https://github.com/user-attachments/assets/9e87c6e3-a7b6-4120-aab7-ceca8c1e5e19)

- Open the "research-assistant" folder in IntelliJ
- Go to run menu -> Edit configurations, in Environment Variables field, Set your Gemini API key, Example `gemini.api.key = <your key>`
- Run `ResearchAssistantApplication` class
- Open the extension on any website, it is ready to use
