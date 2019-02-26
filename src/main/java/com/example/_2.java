
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flow-influencer-match-type",
    "flow-influencer",
    "topic",
    "identifier-description",
    "type",
    "flow-influencer-type",
    "flow-influencer-match",
    "options"
})
public class _2 {

    @JsonProperty("flow-influencer-match-type")
    private String flowInfluencerMatchType;
    @JsonProperty("flow-influencer")
    private Boolean flowInfluencer;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("identifier-description")
    private String identifierDescription;
    @JsonProperty("type")
    private String type;
    @JsonProperty("flow-influencer-type")
    private String flowInfluencerType;
    @JsonProperty("flow-influencer-match")
    private String flowInfluencerMatch;
    @JsonProperty("options")
    private List<Option_> options = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public _2() {
    }

    /**
     * 
     * @param topic
     * @param identifierDescription
     * @param flowInfluencer
     * @param flowInfluencerMatch
     * @param type
     * @param flowInfluencerType
     * @param flowInfluencerMatchType
     * @param options
     */
    public _2(String flowInfluencerMatchType, Boolean flowInfluencer, String topic, String identifierDescription, String type, String flowInfluencerType, String flowInfluencerMatch, List<Option_> options) {
        super();
        this.flowInfluencerMatchType = flowInfluencerMatchType;
        this.flowInfluencer = flowInfluencer;
        this.topic = topic;
        this.identifierDescription = identifierDescription;
        this.type = type;
        this.flowInfluencerType = flowInfluencerType;
        this.flowInfluencerMatch = flowInfluencerMatch;
        this.options = options;
    }

    @JsonProperty("flow-influencer-match-type")
    public String getFlowInfluencerMatchType() {
        return flowInfluencerMatchType;
    }

    @JsonProperty("flow-influencer-match-type")
    public void setFlowInfluencerMatchType(String flowInfluencerMatchType) {
        this.flowInfluencerMatchType = flowInfluencerMatchType;
    }

    @JsonProperty("flow-influencer")
    public Boolean getFlowInfluencer() {
        return flowInfluencer;
    }

    @JsonProperty("flow-influencer")
    public void setFlowInfluencer(Boolean flowInfluencer) {
        this.flowInfluencer = flowInfluencer;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("identifier-description")
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    @JsonProperty("identifier-description")
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("flow-influencer-type")
    public String getFlowInfluencerType() {
        return flowInfluencerType;
    }

    @JsonProperty("flow-influencer-type")
    public void setFlowInfluencerType(String flowInfluencerType) {
        this.flowInfluencerType = flowInfluencerType;
    }

    @JsonProperty("flow-influencer-match")
    public String getFlowInfluencerMatch() {
        return flowInfluencerMatch;
    }

    @JsonProperty("flow-influencer-match")
    public void setFlowInfluencerMatch(String flowInfluencerMatch) {
        this.flowInfluencerMatch = flowInfluencerMatch;
    }

    @JsonProperty("options")
    public List<Option_> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option_> options) {
        this.options = options;
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
