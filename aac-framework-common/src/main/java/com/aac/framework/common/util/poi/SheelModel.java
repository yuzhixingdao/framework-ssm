package com.aac.framework.common.util.poi;

import java.util.List;
import java.util.Map;

import com.aac.framework.common.util.poi.skin.Style;

public class SheelModel {

	private String sheelName;

	private String theme;

	//private String[] titles;
	
	private List<List<CellModel>> others;
	
	private List<CellModel> titles;

	private Map<Integer, List<Object>> datas;
	
	private Map<Integer, List<CellModel>> cells;

	private Style style;

	private List<MergedRegion> mergedRegionList;

	public String getSheelName() {
		return sheelName;
	}

	public void setSheelName(String sheelName) {
		this.sheelName = sheelName;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

//	public String[] getTitles() {
//		return titles;
//	}
//
//	public void setTitles(String[] titles) {
//		this.titles = titles;
//	}

	
	public Style getStyle() {
		if (this.style == null) {
			style = new Style();
		}
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Map<Integer, List<Object>> getDatas() {
		return datas;
	}

	public void setDatas(Map<Integer, List<Object>> datas) {
		this.datas = datas;
	}

	public Map<Integer, List<CellModel>> getCells() {
		return cells;
	}

	public void setCells(Map<Integer, List<CellModel>> cells) {
		this.cells = cells;
	}

	public List<MergedRegion> getMergedRegionList() {
		return mergedRegionList;
	}

	public void setMergedRegionList(List<MergedRegion> mergedRegionList) {
		this.mergedRegionList = mergedRegionList;
	}

	public List<CellModel> getTitles() {
		return titles;
	}

	public void setTitles(List<CellModel> titles) {
		this.titles = titles;
	}

	public List<List<CellModel>> getOthers() {
		return others;
	}

	public void setOthers(List<List<CellModel>> others) {
		this.others = others;
	}

}
