package com.aac.framework.common.util.poi;

import java.util.List;

/**
 * Excel相关属�??
 * @author ShenXiaoqiang
 * @date 2014-11-4
 *
 */
public class ExcelModel {

	private String fileName;
	
	private List<SheelModel> sheels;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<SheelModel> getSheels() {
		return sheels;
	}

	public void setSheels(List<SheelModel> sheels) {
		this.sheels = sheels;
	}

}
