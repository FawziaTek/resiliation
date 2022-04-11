package com.billcom.apc.resiliation.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//	"idAction"
//})
public @SuppressWarnings("serial")
class Data implements Serializable {

//    @JsonProperty("idAction")
    private Integer idAction;
   
//    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//    @JsonProperty("idAction")
    public Integer getIdAction() {
        return idAction;
    }

//    @JsonProperty("idAction")
    public void setIdAction(Integer idAction) {
        this.idAction = idAction;
    }

//    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

//    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
