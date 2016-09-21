package com.aac.framework.common.util.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.aac.framework.common.util.poi.skin.Style;

/**
 * 
 * @author ShenXiaoqiang
 * @date 2014-11-20
 *
 */
public class PoiUtil {

//	/**
//	 * Excel导出
//	 * @param callback
//	 * @param out
//	 * @return
//	 */
//	public static byte[] excutionExport(ExcelCallback callback, OutputStream out) {
//
//		HSSFWorkbook workbook = new HSSFWorkbook();
//
//		ExcelModel excelModel = callback.doInExcelModel();
//
//		if (excelModel != null) {
//			List<SheelModel> sheels = excelModel.getSheels();
//			if(sheels != null && sheels.size() > 0){
//				for (int i = 0; i < sheels.size(); i++) {//创建多个sheel
//					
//					int rowInexMark = 0;
//					
//					SheelModel sheelModel = sheels.get(i);
//					
//					HSSFSheet sheet = workbook.createSheet();
//					workbook.setSheetName(i, sheelModel.getSheelName());
//					
//					String theme = sheelModel.getTheme();
//					String[] titles = sheelModel.getTitles();
//					Map<Integer, List<Object>> datas = sheelModel.getDatas();
//					if(titles != null && titles.length > 0 && datas != null && datas.size() >0){
//	
//						//创建主题�?
//						if(theme != null && !"".equals(theme)){
//							HSSFRow rowTheme = sheet.createRow(rowInexMark++);
//							
//							for (int j = 0; j<titles.length; j++) {
//								HSSFCell cellTheme = rowTheme.createCell(j);
//								
//								//设置单元格样�?
//								HSSFCellStyle cellStyle = workbook.createCellStyle();
//								cellStyle.setBorderTop(sheelModel.getStyle().getCellThemeBorder());
//								cellStyle.setTopBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
//								cellStyle.setBorderRight(sheelModel.getStyle().getCellThemeBorder());
//								cellStyle.setRightBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
//								cellStyle.setBorderBottom(sheelModel.getStyle().getCellThemeBorder());
//								cellStyle.setBottomBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
//								cellStyle.setBorderLeft(sheelModel.getStyle().getCellThemeBorder());
//								cellStyle.setLeftBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
//								//设置字体、颜�?
//								HSSFFont cellFont = workbook.createFont();
//								cellFont.setFontHeight(sheelModel.getStyle().getCellThemeFontHeight());
//								cellFont.setColor(sheelModel.getStyle().getCellThemeFontColor());
//								cellStyle.setFont(cellFont);
//								//设置文字对齐方式
//								cellStyle.setAlignment(sheelModel.getStyle().getCellThemeAlignment());
//								
//								cellTheme.setCellStyle(cellStyle);
//							}
//							rowTheme.getCell(0).setCellValue(theme);
//							
//							//样式设置
//							//合并单元�?
//							sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, titles.length - 1));
//							//设置行高
//							rowTheme.setHeight(sheelModel.getStyle().getRowThemeHeight());
//							
//						}
//						
//						//创建标题�?
//						HSSFRow rowTitle = sheet.createRow(rowInexMark++);
//						for (int j = 0; j<titles.length; j++) {
//							HSSFCell cellTitle = rowTitle.createCell(j);
//							cellTitle.setCellValue(titles[j]);
//							
//							//设置单元格样�?
//							HSSFCellStyle cellStyle = workbook.createCellStyle();
//							cellStyle.setBorderTop(sheelModel.getStyle().getCellTitleBorder());
//							cellStyle.setTopBorderColor(sheelModel.getStyle().getCellTitleBorderColor());
//							cellStyle.setBorderRight(sheelModel.getStyle().getCellTitleBorder());
//							cellStyle.setRightBorderColor(sheelModel.getStyle().getCellTitleBorderColor());
//							cellStyle.setBorderBottom(sheelModel.getStyle().getCellTitleBorder());
//							cellStyle.setBottomBorderColor(sheelModel.getStyle().getCellTitleBorderColor());
//							cellStyle.setBorderLeft(sheelModel.getStyle().getCellTitleBorder());
//							cellStyle.setLeftBorderColor(sheelModel.getStyle().getCellTitleBorderColor());
//							
//							//设置字体、颜�?
//							HSSFFont cellFont = workbook.createFont();
//							cellFont.setFontHeight(sheelModel.getStyle().getCellTitleFontHeight());
//							cellFont.setColor(sheelModel.getStyle().getCellTitleFontColor());
//							cellStyle.setFont(cellFont);
//							//设置文字对齐方式
//							cellStyle.setAlignment(sheelModel.getStyle().getCellTitleAlignment());
//							
//							cellTitle.setCellStyle(cellStyle);
//							
//						}
//						
//						//创建数据�?
//						for (int j = 0; j < datas.size(); j++) {
//							HSSFRow rowData = sheet.createRow(j + rowInexMark);
//							for (int k = 0; k < datas.get(j).size(); k++) {
//								
//								HSSFCell cellData = rowData.createCell(k);
//								cellData.setCellValue(datas.get(j).get(k) + "");
//								
//								//设置单元格样�?
//								HSSFCellStyle cellStyle = workbook.createCellStyle();
//								cellStyle.setBorderTop(sheelModel.getStyle().getCellDataBorder());
//								cellStyle.setTopBorderColor(sheelModel.getStyle().getCellDataBorderColor());
//								cellStyle.setBorderRight(sheelModel.getStyle().getCellDataBorder());
//								cellStyle.setRightBorderColor(sheelModel.getStyle().getCellDataBorderColor());
//								cellStyle.setBorderBottom(sheelModel.getStyle().getCellDataBorder());
//								cellStyle.setBottomBorderColor(sheelModel.getStyle().getCellDataBorderColor());
//								cellStyle.setBorderLeft(sheelModel.getStyle().getCellDataBorder());
//								cellStyle.setLeftBorderColor(sheelModel.getStyle().getCellDataBorderColor());
//								
//								//设置字体、颜�?
//								HSSFFont cellFont = workbook.createFont();
//								cellFont.setFontHeight(sheelModel.getStyle().getCellDataFontHeight());
//								cellFont.setColor(sheelModel.getStyle().getCellDataFontColor());
//								cellStyle.setFont(cellFont);
//								//设置文字对齐方式
//								cellStyle.setAlignment(sheelModel.getStyle().getCellDataAlignment());
//								
//								cellData.setCellStyle(cellStyle);
//								
//							}
//						}
//						
//						//设置列的宽度
//						for (int j = 0; j<titles.length; j++) {
//							sheet.autoSizeColumn(j);
//							int columnWidth = sheet.getColumnWidth(j);
//							sheet.setColumnWidth(j, columnWidth + 20 * 35);
//						}
//						
//						List<MergedRegion> mergedRegionList = sheelModel.getMergedRegionList();
//						if(mergedRegionList != null && mergedRegionList.size() > 0){
//							for(int c = 0; c < mergedRegionList.size(); c++){
//								if(mergedRegionList.get(c) != null 
//										&& mergedRegionList.get(c).getFirstRow() != null && mergedRegionList.get(c).getLastRow() != null
//										&& mergedRegionList.get(c).getFirstCol() != null && mergedRegionList.get(c).getLastCol() != null){
//									
//									sheet.addMergedRegion(new CellRangeAddress(mergedRegionList.get(c).getFirstRow(), mergedRegionList.get(c).getLastRow(), mergedRegionList.get(c).getFirstCol(), mergedRegionList.get(c).getLastCol()));
//								}
//							}
//						}
//						
//					}
//					
//				}
//			} else {
//				return null;
//			}
//		} else {
//			return null;
//		}
//		
//		try {
////			workbook.write(new FileOutputStream(new File("workbook.xls")));
//			workbook.write(out);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		return workbook.getBytes();
//		
//	}
	
	public static byte[] excutionExport2(ExcelCallback callback, OutputStream out) {

		HSSFWorkbook workbook = new HSSFWorkbook();

		ExcelModel excelModel = callback.doInExcelModel();

		if (excelModel != null) {
			List<SheelModel> sheels = excelModel.getSheels();
			if(sheels != null && sheels.size() > 0){
				for (int i = 0; i < sheels.size(); i++) {//shell
					
					int rowInexMark = 0;
					
					SheelModel sheelModel = sheels.get(i);
					
					HSSFSheet sheet = workbook.createSheet();
					workbook.setSheetName(i, sheelModel.getSheelName());
					
					String theme = sheelModel.getTheme();
					List<List<CellModel>> others = sheelModel.getOthers();
					List<CellModel> titles = sheelModel.getTitles();
					Map<Integer, List<CellModel>> cells = sheelModel.getCells();
					if(titles != null && titles.size() > 0 && cells != null && cells.size() >0){
	
						//theme
						if(theme != null && !"".equals(theme)){
							HSSFRow rowTheme = sheet.createRow(rowInexMark++);
							
							for (int j = 0; j<titles.size(); j++) {
								HSSFCell cellTheme = rowTheme.createCell(j);
								
								//set cell style
								HSSFCellStyle cellStyle = workbook.createCellStyle();
								cellStyle.setBorderTop(sheelModel.getStyle().getCellThemeBorder());
								cellStyle.setTopBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
								cellStyle.setBorderRight(sheelModel.getStyle().getCellThemeBorder());
								cellStyle.setRightBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
								cellStyle.setBorderBottom(sheelModel.getStyle().getCellThemeBorder());
								cellStyle.setBottomBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
								cellStyle.setBorderLeft(sheelModel.getStyle().getCellThemeBorder());
								cellStyle.setLeftBorderColor(sheelModel.getStyle().getCellThemeBorderColor());
								//set cell font
								HSSFFont cellFont = workbook.createFont();
								cellFont.setFontHeight(sheelModel.getStyle().getCellThemeFontHeight());
								cellFont.setColor(sheelModel.getStyle().getCellThemeFontColor());
								cellStyle.setFont(cellFont);
								//set cell alignment
								cellStyle.setAlignment(sheelModel.getStyle().getCellThemeAlignment());
								
								cellTheme.setCellStyle(cellStyle);
							}
							rowTheme.getCell(0).setCellValue(theme);
							
							//set merged region
							sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, titles.size() - 1));
							//set row height
							rowTheme.setHeight(sheelModel.getStyle().getRowThemeHeight());
							
						}
						
						//others
						for (int j = 0; j<others.size(); j++) {
							HSSFRow rowOther = sheet.createRow(rowInexMark++);
							
							for (int k = 0; k < others.get(j).size(); k++) {
								
								CellModel data = others.get(j).get(k);
								Style style = data.getStyle() == null ? sheelModel.getStyle() : data.getStyle();
								
								HSSFCell cellOther = rowOther.createCell(k);
								cellOther.setCellValue(data.getValue() + "");
								
								//set cell style
								HSSFCellStyle cellStyle = workbook.createCellStyle();
								cellStyle.setBorderTop(style.getCellDataBorder());
								cellStyle.setTopBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderRight(style.getCellDataBorder());
								cellStyle.setRightBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderBottom(style.getCellDataBorder());
								cellStyle.setBottomBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderLeft(style.getCellDataBorder());
								cellStyle.setLeftBorderColor(style.getCellDataBorderColor());
								
								//set cell font
								HSSFFont cellFont = workbook.createFont();
								cellFont.setFontHeight(style.getCellDataFontHeight());
								cellFont.setColor(style.getCellDataFontColor());
								cellStyle.setFont(cellFont);
								//set alignment
								cellStyle.setAlignment(style.getCellDataAlignment());
								
								cellOther.setCellStyle(cellStyle);
							}
							
						}
						
						//title
						if(titles != null && titles.size() > 0){
							
							HSSFRow rowTitle = sheet.createRow(rowInexMark++);
							
							for (int j = 0; j<titles.size(); j++) {
								
								CellModel data = titles.get(j);
								Style style = data.getStyle() == null ? sheelModel.getStyle() : data.getStyle();
								
								HSSFCell cellTitle = rowTitle.createCell(j);
								cellTitle.setCellValue(data.getValue() + "");
								
								//set cell style
								HSSFCellStyle cellStyle = workbook.createCellStyle();
								cellStyle.setBorderTop(style.getCellTitleBorder());
								cellStyle.setTopBorderColor(style.getCellTitleBorderColor());
								cellStyle.setBorderRight(style.getCellTitleBorder());
								cellStyle.setRightBorderColor(style.getCellTitleBorderColor());
								cellStyle.setBorderBottom(style.getCellTitleBorder());
								cellStyle.setBottomBorderColor(style.getCellTitleBorderColor());
								cellStyle.setBorderLeft(style.getCellTitleBorder());
								cellStyle.setLeftBorderColor(style.getCellTitleBorderColor());
								
								//set cell font
								HSSFFont cellFont = workbook.createFont();
								cellFont.setFontHeight(style.getCellTitleFontHeight());
								cellFont.setColor(style.getCellTitleFontColor());
								cellStyle.setFont(cellFont);
								//set alignment
								cellStyle.setAlignment(style.getCellTitleAlignment());
								
								cellTitle.setCellStyle(cellStyle);
								
							}
						}
						
						List<HSSFCellStyle> styleList = new ArrayList<HSSFCellStyle>();
						
						if(cells.size() > 0) {
							CellModel data = null;
							Style style = null;
							HSSFCellStyle cellStyle = null;
							HSSFFont cellFont = null;
							
							for (int k = 0; k < cells.get(0).size(); k++) {
								data = cells.get(0).get(k);
								style = data.getStyle() == null ? sheelModel.getStyle() : data.getStyle();
								//set cell style
								cellStyle = workbook.createCellStyle();
								cellStyle.setBorderTop(style.getCellDataBorder());
								cellStyle.setTopBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderRight(style.getCellDataBorder());
								cellStyle.setRightBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderBottom(style.getCellDataBorder());
								cellStyle.setBottomBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderLeft(style.getCellDataBorder());
								cellStyle.setLeftBorderColor(style.getCellDataBorderColor());
								
								//set cell font
								cellFont = workbook.createFont();
								cellFont.setFontHeight(style.getCellDataFontHeight());
								cellFont.setColor(style.getCellDataFontColor());
								cellStyle.setFont(cellFont);
								//set cell alignment
								cellStyle.setAlignment(style.getCellDataAlignment());
								
								styleList.add(cellStyle);
							}
						}
						
						//cell
						for (int j = 0; j < cells.size(); j++) {
							HSSFRow rowData = sheet.createRow(j + rowInexMark);
							CellModel data = null;
							HSSFCell cellData = null;
							for (int k = 0; k < cells.get(j).size(); k++) {
								
								data = cells.get(j).get(k);
								// Style style = data.getStyle() == null ? sheelModel.getStyle() : data.getStyle();
								
								cellData = rowData.createCell(k);
								cellData.setCellValue(data.getValue() + "");
								
								/*//set cell style
								HSSFCellStyle cellStyle = workbook.createCellStyle();
								cellStyle.setBorderTop(style.getCellDataBorder());
								cellStyle.setTopBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderRight(style.getCellDataBorder());
								cellStyle.setRightBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderBottom(style.getCellDataBorder());
								cellStyle.setBottomBorderColor(style.getCellDataBorderColor());
								cellStyle.setBorderLeft(style.getCellDataBorder());
								cellStyle.setLeftBorderColor(style.getCellDataBorderColor());
								
								//set cell font
								HSSFFont cellFont = workbook.createFont();
								cellFont.setFontHeight(style.getCellDataFontHeight());
								cellFont.setColor(style.getCellDataFontColor());
								cellStyle.setFont(cellFont);
								//set cell alignment
								cellStyle.setAlignment(style.getCellDataAlignment());*/
								
								cellData.setCellStyle(styleList.get(k));
								
							}
						}
						
						//set merged region
						List<MergedRegion> mergedRegionList = sheelModel.getMergedRegionList();
						if(mergedRegionList != null && mergedRegionList.size() > 0){
							for(int c = 0; c < mergedRegionList.size(); c++){
								if(mergedRegionList.get(c) != null 
										&& mergedRegionList.get(c).getFirstRow() != null && mergedRegionList.get(c).getLastRow() != null
										&& mergedRegionList.get(c).getFirstCol() != null && mergedRegionList.get(c).getLastCol() != null){
									
									sheet.addMergedRegion(new CellRangeAddress(mergedRegionList.get(c).getFirstRow(), mergedRegionList.get(c).getLastRow(), mergedRegionList.get(c).getFirstCol(), mergedRegionList.get(c).getLastCol()));
								}
							}
						}
						
						//set column size
						for (int j = 0; j<titles.size(); j++) {
							sheet.autoSizeColumn(j);
							int columnWidth = sheet.getColumnWidth(j);
							sheet.setColumnWidth(j, columnWidth + 20 * 35);
						}
						
					}
					
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
		
		try {
			//workbook.write(new FileOutputStream(new File("workbook.xls")));
			workbook.write(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return workbook.getBytes();
		
	}

	/**
	 * Excel导入
	 * @param input
	 * @param titleRows 标题占几�?
	 * @return
	 */
	public static List<List<String>> excutionImport(InputStream input, Integer titleRows){
		
		List<List<String>> data = new ArrayList<List<String>>();
		
        try {
        	//创建Excel工作�? 
			HSSFWorkbook workbook = new HSSFWorkbook(input);
			int sheetLength = workbook.getNumberOfSheets();
			
			for(int i=0; i<sheetLength; i++){
				
				HSSFSheet sheet = workbook.getSheetAt(i);
				int rowLenght = sheet.getPhysicalNumberOfRows();
				
				for(int j=titleRows; j<rowLenght; j++){
					
					HSSFRow row = sheet.getRow(j);
					int cellLenth = row.getPhysicalNumberOfCells();
					
					List<String> rowData = new ArrayList<String>();
					
					for(int k = 0; k<cellLenth; k++){
						HSSFCell cell = row.getCell(k);
						String value = getCellValue(cell);
						rowData.add(value);
						System.out.print(value + "\t");
					}
					System.out.println();
					
					data.add(rowData);
					
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	/**
	 * Excel导入
	 */
	public static <D> List<D> excutionImport(InputStream input, String templetFileName, Class<D> clazz){
		
		List<D> data = new ArrayList<D>();
		
		try {
			
			String path = PoiUtil.class.getClassLoader().getResource("").getFile();
			path = path + "config" + File.separator + "excel" + File.separator + templetFileName;
			InputStream inputTemplet = new FileInputStream(path);
			
			//创建Excel工作�? 
			Workbook workbookTemplet = null;
			Workbook workbook = null;
			
//			try {
//				workbook = new XSSFWorkbook(input);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
			try {
				workbookTemplet = new HSSFWorkbook(inputTemplet);
				workbook = new HSSFWorkbook(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			int sheetLengthTemplet = workbookTemplet.getNumberOfSheets();
			
			for(int i=0; i<sheetLengthTemplet; i++){
				
				Sheet sheetTemplet = workbookTemplet.getSheetAt(i);
				Sheet sheet = workbook.getSheetAt(i);
				
				int rowLenghtTemplet = sheetTemplet.getPhysicalNumberOfRows();
				int rowLenght = sheet.getPhysicalNumberOfRows();
				
				for (int j = 0 + rowLenghtTemplet - 2; j < rowLenght; j++) {
					
					Row rowTempletTitle = sheetTemplet.getRow(rowLenghtTemplet-3);
					Row rowTempletProperty = sheetTemplet.getRow(rowLenghtTemplet-2);
					Row rowTempletType = sheetTemplet.getRow(rowLenghtTemplet-1);
					Row row = sheet.getRow(j);
					
					int cellLenth = rowTempletTitle.getPhysicalNumberOfCells();
					
					D dto = clazz.newInstance();
					
					for(int k = 0; k<cellLenth; k++){
						Cell cellData = row.getCell(k);
						Cell cellTempletProperty = rowTempletProperty.getCell(k);
						Cell cellTempletType = rowTempletType.getCell(k);
						String value = getCellValue(cellData);
						
						setDtoValue(dto, cellData, cellTempletProperty, cellTempletType);
						
						System.out.print(value + "\t");
					}
					System.out.println();
					
					data.add(dto);
					
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
		return data;
	}
	
	private static String getCellValue(Cell cell){
		
		String value = null;
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			if(HSSFDateUtil.isCellDateFormatted(cell)){
				Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
				value = DateUtil.date2Str(date);
			}else{
				cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				value = String.valueOf(cell.getStringCellValue().trim());
			}
			break;

		default:
			cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			value = String.valueOf(cell.getStringCellValue().trim());
			break;
		}
		
		return value;
		
		/*String value = null;
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_BLANK:
			value = "";
			break;
		case HSSFCell.CELL_TYPE_STRING:
			value = String.valueOf(cell.getStringCellValue().trim());
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			if(HSSFDateUtil.isCellDateFormatted(cell)){
				Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
				value = DateUtil.date2Str(date);
			}else{
				value = String.valueOf(cell.getNumericCellValue());
			}
			break;
		case HSSFCell.CELL_TYPE_FORMULA:
			value = String.valueOf(cell.getCellFormula());
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN:
			value = String.valueOf(cell.getBooleanCellValue());
			break;
		case HSSFCell.CELL_TYPE_ERROR:
			value = String.valueOf(cell.getErrorCellValue());
			break;

		default:
			break;
		}
		return value;*/
	}
	
	private static <D> void setDtoValue(D dto, Cell cellData, Cell cellTempletProperty, Cell cellTempletType){
		
		String data = getCellValue(cellData);
		String property = getCellValue(cellTempletProperty);
		String type = getCellValue(cellTempletType);
		
		property = "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
		
		Class<? extends Object> dtoClazz = dto.getClass();
		
		try {
			if(type != null){
				if("STRING".equals(type.toUpperCase())){
					Method method = dtoClazz.getMethod(property, String.class);
					method.invoke(dto, data);
				}else if("INTEGER".equals(type.toUpperCase())){
					Method method = dtoClazz.getMethod(property, Integer.class);
					Integer value = data == null || "".equals(data) ? null : Integer.parseInt(data);
					method.invoke(dto, value);
				}else if("DOUBLE".equals(type.toUpperCase())){
					Method method = dtoClazz.getMethod(property, Double.class);
					Double value = data == null || "".equals(data) ? null : Double.parseDouble(data);
					method.invoke(dto, value);
				}else if("DATE".equals(type.toUpperCase())){
					Method method = dtoClazz.getMethod(property, Date.class);
					Date value = data == null || "".equals(data) ? null : DateUtil.str2Date(data, DateUtil.format_one);
					method.invoke(dto, value);
				}
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param cellList
	 * @param cellNumber
	 */
	public static void createCellList(List<CellModel> cellList, Integer cellNumber){
		if(cellList != null && cellNumber != null && cellNumber > 0){
			for(int i=0; i<cellNumber; i++){
				cellList.add(new CellModel(""));
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		 byte[] bs = excutionExport2(new ExcelCallback() {
			
			public ExcelModel doInExcelModel() {
				ExcelModel model = new ExcelModel();
				
				List<SheelModel> list = new ArrayList<SheelModel>();
				
				for (int c = 0; c < 2; c++) {
					SheelModel sheel = new SheelModel();
					sheel.setTheme("Title" + c);
					sheel.setSheelName("sheel name" + c);
					
					List<CellModel> titleList = new ArrayList<CellModel>();
					titleList.add(new CellModel("ID"));
					titleList.add(new CellModel("CODE"));
					titleList.add(new CellModel("MONEY"));
					sheel.setTitles(titleList);
					
					Map<Integer, List<CellModel>> mapData = new HashMap<Integer, List<CellModel>>();
					for (int i = 0; i < 500; i++) {
						List data = new ArrayList();
						data.add(new CellModel("id" + i));
						data.add(new CellModel("code" + i));
						data.add(new CellModel("money" + i));
						mapData.put(i, data);
					}
					sheel.setCells(mapData);
					sheel.setStyle(new Style());
					list.add(sheel);
				}
				
				model.setSheels(list);
				
				return model;
			}
		}, new FileOutputStream(new File("e:\\workbooks.xls")));
		 
//		 OutputStream out = new FileOutputStream(new File("e:\\workbooks.xls"));
//		 out.write(bs);
//		 out.close();
		
//		FileInputStream input = new FileInputStream("E:\\bbs.xls");
//		List<List<String>> data = excutionImport(input);
//		for (int i = 0; i < data.size(); i++) {
//			List<String> rowData = data.get(i);
//			for (int j = 0; j < rowData.size(); j++) {
//				System.out.print(rowData.get(j) + "\t");
//			}
//			System.out.println();
//		}
		
//		FileInputStream input = new FileInputStream("E:\\user-data.xls");
//		List<MUserDTO> data = excutionImport(input, "user-templet.xls", MUserDTO.class);
//		System.out.println(data);
		
		String path = PoiUtil.class.getClassLoader().getResource("").getPath();
		System.out.println(path);
		
	}

}
