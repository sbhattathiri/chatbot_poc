
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
    "options",
    "topic",
    "type",
    "sensitive"
})
public class _0 {

    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sensitive")
    private Boolean sensitive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public _0() {
    }

    /**
     * 
     * @param topic
     * @param type
     * @param sensitive
     * @param options
     */
    public _0(List<Option> options, String topic, String type, Boolean sensitive) {
        super();
        this.options = options;
        this.topic = topic;
        this.type = type;
        this.sensitive = sensitive;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
