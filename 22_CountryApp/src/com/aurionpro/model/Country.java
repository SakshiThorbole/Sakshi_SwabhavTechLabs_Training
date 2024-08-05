package com.aurionpro.model;

public class Country {
	private String code;
	private String name;
	private int regionId;
	
	public Country(String code, String name, int regionId) {
		super();
		this.code = code;
		this.name = name;
		this.regionId = regionId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Country [code = " + code + ", name = " + name + ", regionId = " + regionId + "]";
	}
}
