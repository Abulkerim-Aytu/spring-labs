
package com.cydeo.lab09rest.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "USDEUR",
    "USDGBP",
    "USDCAD",
    "USDPLN"
})
@Generated("jsonschema2pojo")
public class QuotesDTO {

    @JsonProperty("USDEUR")
    private Double usdeur;
    @JsonProperty("USDGBP")
    private Double usdgbp;
    @JsonProperty("USDCAD")
    private Double usdcad;
    @JsonProperty("USDPLN")
    private Double usdpln;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("USDEUR")
    public Double getUsdeur() {
        return usdeur;
    }

    @JsonProperty("USDEUR")
    public void setUsdeur(Double usdeur) {
        this.usdeur = usdeur;
    }

    @JsonProperty("USDGBP")
    public Double getUsdgbp() {
        return usdgbp;
    }

    @JsonProperty("USDGBP")
    public void setUsdgbp(Double usdgbp) {
        this.usdgbp = usdgbp;
    }

    @JsonProperty("USDCAD")
    public Double getUsdcad() {
        return usdcad;
    }

    @JsonProperty("USDCAD")
    public void setUsdcad(Double usdcad) {
        this.usdcad = usdcad;
    }

    @JsonProperty("USDPLN")
    public Double getUsdpln() {
        return usdpln;
    }

    @JsonProperty("USDPLN")
    public void setUsdpln(Double usdpln) {
        this.usdpln = usdpln;
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
