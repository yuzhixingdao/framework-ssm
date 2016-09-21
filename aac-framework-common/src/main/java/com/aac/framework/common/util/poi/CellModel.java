package com.aac.framework.common.util.poi;

import com.aac.framework.common.util.poi.skin.Style;

public class CellModel {

	private String value;

	private Style style;

	public CellModel() {
		super();
	}

	public CellModel(String value) {
		super();
		this.value = value;
	}

	public CellModel(String value, Style style) {
		super();
		this.value = value;
		this.style = style;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Style getStyle() {
		if (this.style == null) {
			this.style = new Style();
		}
		return this.style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

}
