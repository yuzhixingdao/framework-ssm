package com.aac.framework.service;

import java.util.List;
import java.util.Map;

import com.aac.framework.exception.ServiceException;

public interface DictionaryService {

	Map<String, List<Object>> getDictionaryList() throws ServiceException;
	
}
