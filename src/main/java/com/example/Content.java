
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
    "3",
    "resume_required"
})
public class Content {

    @JsonProperty("3")
    private List<com.example._3> _3 = null;
    @JsonProperty("resume_required")
    private ResumeRequired resumeRequired;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param resumeRequired
     * @param _3
     */
    public Content(List<com.example._3> _3, ResumeRequired resumeRequired) {
        super();
        this._3 = _3;
        this.resumeRequired = resumeRequired;
    }

    @JsonProperty("3")
    public List<com.example._3> get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(List<com.example._3> _3) {
        this._3 = _3;
    }

    @JsonProperty("resume_required")
    public ResumeRequired getResumeRequired() {
        return resumeRequired;
    }

    @JsonProperty("resume_required")
    public void setResumeRequired(ResumeRequired resumeRequired) {
        this.resumeRequired = resumeRequired;
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
