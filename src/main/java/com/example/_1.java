
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
    "type",
    "topic",
    "duration",
    "sensitive"
})
public class _1 {

    @JsonProperty("type")
    private String type;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("sensitive")
    private Boolean sensitive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public _1() {
    }

    /**
     * 
     * @param topic
     * @param duration
     * @param type
     * @param sensitive
     */
    public _1(String type, String topic, String duration, Boolean sensitive) {
        super();
        this.type = type;
        this.topic = topic;
        this.duration = duration;
        this.sensitive = sensitive;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("sensitive")
    public Boolean getSensitive() {
        return sensitive;
    }

    @JsonProperty("sensitive")
    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
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
