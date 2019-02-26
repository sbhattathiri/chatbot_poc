
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "content",
    "start_section_message",
    "title",
    "contentType",
    "short-title"
})
public class Assessment {

    @JsonProperty("content")
    private Content content;
    @JsonProperty("start_section_message")
    private String startSectionMessage;
    @JsonProperty("title")
    private String title;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("short-title")
    private String shortTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Assessment() {
    }

    /**
     * 
     * @param content
     * @param title
     * @param shortTitle
     * @param startSectionMessage
     * @param contentType
     */
    public Assessment(Content content, String startSectionMessage, String title, String contentType, String shortTitle) {
        super();
        this.content = content;
        this.startSectionMessage = startSectionMessage;
        this.title = title;
        this.contentType = contentType;
        this.shortTitle = shortTitle;
    }

    @JsonProperty("content")
    public Content getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonProperty("start_section_message")
    public String getStartSectionMessage() {
        return startSectionMessage;
    }

    @JsonProperty("start_section_message")
    public void setStartSectionMessage(String startSectionMessage) {
        this.startSectionMessage = startSectionMessage;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("short-title")
    public String getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("short-title")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
