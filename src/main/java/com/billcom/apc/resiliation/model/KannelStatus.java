package com.billcom.apc.resiliation.model;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public @SuppressWarnings("serial")
class KannelStatus implements Serializable {
	private Integer kannelId;
	private Integer code;
	private String message;
	 private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public Integer getKannelId() {
		return kannelId;
	}

	public void setKannelId(Integer kannelId) {
		this.kannelId = kannelId;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 public Map<String, Object> getAdditionalProperties() {
	        return this.additionalProperties;
	    }
	    public void setAdditionalProperty(String name, Object value) {
	        this.additionalProperties.put(name, value);
	    }

}
