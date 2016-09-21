package com.aac.framework.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.aac.framework.entity.Dictionary;
import com.aac.framework.service.DictionaryService;

public class DictService {

	private static Map<String, List<Object>> dictMap = null;
	
	@Resource
	private DictionaryService dictionaryService;

	public void init() {
		dictMap = dictionaryService.getDictionaryList();
	}
	
	public static String getDictText(String dictType, String dictCode){
		
		List<Object> dictList = getDictList(dictType);
		
		if(dictList != null && dictList.size() > 0 && dictCode != null){
			
			String dictText = "";
			String[] codes = null;
			if (dictCode.indexOf(",") > 0) {
				codes = dictCode.split(",");
			}
			
			for (int i = 0; i < dictList.size(); i++) {
				
				Dictionary dict = (Dictionary)dictList.get(i);
				
				if (codes != null) {
					for (int j = 0; j < codes.length; j++) {
						if(dict.getDictCode() != null && dict.getDictCode().toUpperCase().equals(codes[j].trim().toUpperCase())){
							dictText += dict.getDictText() + ",";
						}
					}
				}else{
					if(dict.getDictCode() != null && dict.getDictCode().toUpperCase().equals(dictCode.toUpperCase())){
						dictText = dict.getDictText();
						break;
					}
				}
				
			}
			
			if(!dictText.equals("") && dictText.indexOf(",") > 0){
				dictText = dictText.substring(0, dictText.length()-1);
			}
			
			return dictText;
			
		}
		return "";
	}
	
	public static List<Object> getDictList(String dictType){
		if(dictMap != null && !dictMap.isEmpty()){
			if(dictType.indexOf(",") > -1){
				String[] split = dictType.split(",");
				List<Object> retList = new ArrayList<Object>();
				for(int i=0; i<split.length; i++){
					List<Object> list = dictMap.get(split[i]);
					for(int j=0; list != null && list.size() > 0 && j < list.size(); j++){
						retList.add(list.get(j));
					}
				}
				return retList;
			}else{
				return dictMap.get(dictType);
			}
		}
		return null;
	}
	
	public static String getDictCode(String dictType, String dictText){
		if(dictType != null && dictText != null){
			if(dictMap != null && !dictMap.isEmpty()){
				List<Object> list = dictMap.get(dictType);
				for (int i = 0; i < list.size(); i++) {
					Dictionary dict = (Dictionary)list.get(i);
					if(dict.getDictText() != null && dict.getDictText().equals(dictText)){
						return dict.getDictCode();
					}
				}
			}
		}
		return null;
	}
	
}
