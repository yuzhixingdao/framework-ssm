package com.aac.framework.common.util.poi;

public class MergedRegion {

	private Integer firstRow;
	private Integer lastRow;
	private Integer firstCol;
	private Integer lastCol;

	public MergedRegion() {
		super();
	}

	public MergedRegion(Integer firstRow, Integer lastRow, Integer firstCol, Integer lastCol) {
		super();
		this.firstRow = firstRow;
		this.lastRow = lastRow;
		this.firstCol = firstCol;
		this.lastCol = lastCol;
	}

	public Integer getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(Integer firstRow) {
		this.firstRow = firstRow;
	}

	public Integer getLastRow() {
		return lastRow;
	}

	public void setLastRow(Integer lastRow) {
		this.lastRow = lastRow;
	}

	public Integer getFirstCol() {
		return firstCol;
	}

	public void setFirstCol(Integer firstCol) {
		this.firstCol = firstCol;
	}

	public Integer getLastCol() {
		return lastCol;
	}

	public void setLastCol(Integer lastCol) {
		this.lastCol = lastCol;
	}

}
