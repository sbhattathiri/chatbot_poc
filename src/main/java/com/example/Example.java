
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
    "withdrawn",
    "post-application",
    "parameters",
    "pre-application",
    "copy-withdraw-structure",
    "in-application"
})
public class Example {

    @JsonProperty("withdrawn")
    private Withdrawn withdrawn;
    @JsonProperty("post-application")
    private PostApplication postApplication;
    @JsonProperty("parameters")
    private List<Parameter> parameters = null;
    @JsonProperty("pre-application")
    private PreApplication preApplication;
    @JsonProperty("copy-withdraw-structure")
    private CopyWithdrawStructure copyWithdrawStructure;
    @JsonProperty("in-application")
    private InApplication inApplication;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param postApplication
     * @param withdrawn
     * @param inApplication
     * @param copyWithdrawStructure
     * @param parameters
     * @param preApplication
     */
    public Example(Withdrawn withdrawn, PostApplication postApplication, List<Parameter> parameters, PreApplication preApplication, CopyWithdrawStructure copyWithdrawStructure, InApplication inApplication) {
        super();
        this.withdrawn = withdrawn;
        this.postApplication = postApplication;
        this.parameters = parameters;
        this.preApplication = preApplication;
        this.copyWithdrawStructure = copyWithdrawStructure;
        this.inApplication = inApplication;
    }

    @JsonProperty("withdrawn")
    public Withdrawn getWithdrawn() {
        return withdrawn;
    }

    @JsonProperty("withdrawn")
    public void setWithdrawn(Withdrawn withdrawn) {
        this.withdrawn = withdrawn;
    }

    @JsonProperty("post-application")
    public PostApplication getPostApplication() {
        return postApplication;
    }

    @JsonProperty("post-application")
    public void setPostApplication(PostApplication postApplication) {
        this.postApplication = postApplication;
    }

    @JsonProperty("parameters")
    public List<Parameter> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("pre-application")
    public PreApplication getPreApplication() {
        return preApplication;
    }

    @JsonProperty("pre-application")
    public void setPreApplication(PreApplication preApplication) {
        this.preApplication = preApplication;
    }

    @JsonProperty("copy-withdraw-structure")
    public CopyWithdrawStructure getCopyWithdrawStructure() {
        return copyWithdrawStructure;
    }

    @JsonProperty("copy-withdraw-structure")
    public void setCopyWithdrawStructure(CopyWithdrawStructure copyWithdrawStructure) {
        this.copyWithdrawStructure = copyWithdrawStructure;
    }

    @JsonProperty("in-application")
    public InApplication getInApplication() {
        return inApplication;
    }

    @JsonProperty("in-application")
    public void setInApplication(InApplication inApplication) {
        this.inApplication = inApplication;
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
