package com.cs.model.base;

public class Model implements IModel {

	private static final long serialVersionUID = 1L;
	private String id;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
