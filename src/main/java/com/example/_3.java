
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
    "0",
    "1",
    "2"
})
public class _3 {

    @JsonProperty("0")
    private com.example._0 _0;
    @JsonProperty("1")
    private com.example._1 _1;
    @JsonProperty("2")
    private com.example._2 _2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public _3() {
    }

    /**
     * 
     * @param _0
     * @param _1
     * @param _2
     */
    public _3(com.example._0 _0, com.example._1 _1, com.example._2 _2) {
        super();
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
    }

    @JsonProperty("0")
    public com.example._0 get0() {
        return _0;
    }

    @JsonProperty("0")
    public void set0(com.example._0 _0) {
        this._0 = _0;
    }

    @JsonProperty("1")
    public com.example._1 get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(com.example._1 _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public com.example._2 get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(com.example._2 _2) {
        this._2 = _2;
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
