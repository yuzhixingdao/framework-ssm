package com.aac.framework.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aac.framework.dao.SysDao;
import com.aac.framework.entity.Dictionary;
import com.aac.framework.exception.ServiceException;
import com.aac.framework.service.DictionaryService;

@Service(value = "dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

	@Resource
	private SysDao sysDao;

	public Map<String, List<Object>> getDictionaryList() throws ServiceException {

		List<Dictionary> list = sysDao.selectListEntity("dictionaryMapper.selectList", new Dictionary());

		if (list != null && list.size() > 0) {

			Map<String, List<Object>> map = new HashMap<String, List<Object>>();

			for (int i = 0; i < list.size(); i++) {
				Dictionary dict = (Dictionary) list.get(i);
				String dictType = dict.getDictType();

				List<Object> vllist = map.get(dictType);
				if (vllist == null) {
					vllist = new ArrayList();
				}

				vllist.add(dict);

				map.put(dictType, vllist);

			}

			return map;

		}

		return null;
	}
	

}
