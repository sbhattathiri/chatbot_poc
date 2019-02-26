
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
    "assessments"
})
public class InApplication {

    @JsonProperty("assessments")
    private List<Assessment> assessments = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InApplication() {
    }

    /**
     * 
     * @param assessments
     */
    public InApplication(List<Assessment> assessments) {
        super();
        this.assessments = assessments;
    }

    @JsonProperty("assessments")
    public List<Assessment> getAssessments() {
        return assessments;
    }

    @JsonProperty("assessments")
    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
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
