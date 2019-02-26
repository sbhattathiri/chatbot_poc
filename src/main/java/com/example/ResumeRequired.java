
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
    "compulsory-fields",
    "optional",
    "required"
})
public class ResumeRequired {

    @JsonProperty("compulsory-fields")
    private List<Object> compulsoryFields = null;
    @JsonProperty("optional")
    private Boolean optional;
    @JsonProperty("required")
    private Boolean required;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResumeRequired() {
    }

    /**
     * 
     * @param optional
     * @param required
     * @param compulsoryFields
     */
    public ResumeRequired(List<Object> compulsoryFields, Boolean optional, Boolean required) {
        super();
        this.compulsoryFields = compulsoryFields;
        this.optional = optional;
        this.required = required;
    }

    @JsonProperty("compulsory-fields")
    public List<Object> getCompulsoryFields() {
        return compulsoryFields;
    }

    @JsonProperty("compulsory-fields")
    public void setCompulsoryFields(List<Object> compulsoryFields) {
        this.compulsoryFields = compulsoryFields;
    }

    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
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
