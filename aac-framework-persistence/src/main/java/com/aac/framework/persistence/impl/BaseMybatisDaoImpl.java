package com.aac.framework.persistence.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import com.aac.framework.dict.PageStatus;
import com.aac.framework.exception.DAOException;
import com.aac.framework.persistence.BaseMybatisDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class BaseMybatisDaoImpl implements BaseMybatisDao {
	
	@Resource protected SqlSessionTemplate sqlSessionTemplate;

	public <ENTITY> ENTITY selectOne(String statement, ENTITY entity)
			throws DAOException {
		if(entity != null){
			List<Object> listEntity = sqlSessionTemplate.selectList(statement, entity);
			if(listEntity != null && listEntity.size() > 0){
				Object object = listEntity.get(0);
				return (ENTITY)object;
			}
		}
		return null;
	}

	
	public Object selectOne(String statement, Serializable id)
			throws DAOException {
		if (id != null) {
			Object object = sqlSessionTemplate.selectOne(statement, id);
			if(object != null){
				return object;
			}
		}
		return null;
	}

	
	public <ENTITY> ENTITY insert(String statement, ENTITY entity)
			throws DAOException {
		if (entity != null) {
			int row = sqlSessionTemplate.insert(statement, entity);
			if (row > 0) {
				return entity;
			}
		}
		return null;
	}

	
	public <ENTITY> ENTITY update(String statement, ENTITY entity)
			throws DAOException {
		if (entity != null) {
			int row = sqlSessionTemplate.update(statement, entity);
			if (row > 0) {
				return entity;
			}
		}
		return null;
	}

	
	public int delete(String statement, Serializable id) throws DAOException {
		if (id != null) {
			int row = sqlSessionTemplate.delete(statement, id);
			return row;
		}
		return 0;
	}

	
	public <ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, Integer pageNum,
			Integer pageSize) throws DAOException {
		
		RowBounds rowBounds = new RowBounds((pageNum-1) * pageSize, pageSize);
		List<Object> list = sqlSessionTemplate.selectList(statement, entity, rowBounds);
		
		if (list != null && list.size() > 0) {
			return (List<ENTITY>) list;
		}
		
		return null;
	}

	
	public <ENTITY> List<ENTITY> selectListEntity(String statement,
			ENTITY entity) throws DAOException {
		List<Object> list = sqlSessionTemplate.selectList(statement, entity);
		if (list != null && list.size() > 0) {
			return (List<ENTITY>) list;
		}
		return null;
	}
	
	public <ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, Map<String, Object> map) throws DAOException {
		
		List<Object> retList = sqlSessionTemplate.selectList(statement, map);
		if (retList != null && retList.size() > 0) {
			return (List<ENTITY>) retList;
		}
		
		return null;
	}
	
	public <ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, List<Long> list) throws DAOException {
		List<Object> retList = sqlSessionTemplate.selectList(statement, list);
		if (retList != null && retList.size() > 0) {
			return (List<ENTITY>) retList;
		}
		return null;
	}

	
	public <ENTITY> Map<String, Object> selectPageEntity(String statement,
			String statementCount, ENTITY entity, Integer pageNum,
			Integer pageSize) throws DAOException {
		
		RowBounds rowBounds = new RowBounds((pageNum-1) * pageSize, pageSize);
		List<Object> list = sqlSessionTemplate.selectList(statement, entity, rowBounds);
		
		int count = selectCount(statementCount, entity);
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(PageStatus.PAGE_LIST, list);
		dataMap.put(PageStatus.PAGE_NUM, pageNum);
		dataMap.put(PageStatus.PAGE_SIZE, pageSize);
		dataMap.put(PageStatus.TOTAL_PAGE, (count-1) / pageSize + 1);
		dataMap.put(PageStatus.TOTAL_ROW, count);
		
		return dataMap;
		
	}

	
	public <ENTITY> Map<String, Object> selectPageEntity(String statement,
			ENTITY entity, Integer pageNum, Integer pageSize)
					throws DAOException {
		
		PageHelper.startPage(pageNum, pageSize);
		List list = sqlSessionTemplate.selectList(statement, entity);
		
		if (list != null) {
			
			PageInfo<ENTITY> page = new PageInfo<ENTITY>(list);
			
			Map<String, Object> dataMap = new HashMap<String, Object>();
			dataMap.put(PageStatus.PAGE_LIST, page.getList());
			dataMap.put(PageStatus.PAGE_NUM, pageNum);
			dataMap.put(PageStatus.PAGE_SIZE, pageSize);
			dataMap.put(PageStatus.TOTAL_PAGE, (page.getTotal()-1) / pageSize + 1);
			dataMap.put(PageStatus.TOTAL_ROW, page.getTotal());
			
			return dataMap;
			
		}
		
		return null;
	}
	
	
	public <ENTITY> int selectCount(String statement, ENTITY entity)
			throws DAOException {
		Object object = sqlSessionTemplate.selectOne(statement, entity);
		if (object != null) {
			return Integer.valueOf(object.toString());
		}
		return 0;
	}
	
	public int selectCount(String statement, Map<String, Object> map) throws DAOException {
		Object object = sqlSessionTemplate.selectOne(statement, map);
		if (object != null) {
			return Integer.valueOf(object.toString());
		}
		return 0;
	}
	
	
	public List<Map<String, Object>> selectListMap(String statement, Map<String, Object> map) throws DAOException {
		
		List<Map<String, Object>> list = sqlSessionTemplate.selectList(statement, map);
		if (list != null) {
			return list;
		}
		
		return null;
	}


	public Map<String, Object> selectPageMap(String statement, Map<String, Object> map, Integer pageNum,
			Integer pageSize) throws DAOException {
		
		PageHelper.startPage(pageNum, pageSize);
		List<Object> list = sqlSessionTemplate.selectList(statement, map);
		
		if (list != null) {
			
			PageInfo<Object> page = new PageInfo<Object>(list);
			
			Map<String, Object> dataMap = new HashMap<String, Object>();
			dataMap.put(PageStatus.PAGE_LIST, page.getList());
			dataMap.put(PageStatus.PAGE_NUM, pageNum);
			dataMap.put(PageStatus.PAGE_SIZE, pageSize);
			dataMap.put(PageStatus.TOTAL_PAGE, (page.getTotal()-1) / pageSize + 1);
			dataMap.put(PageStatus.TOTAL_ROW, page.getTotal());
			
			return dataMap;
			
		}
		
		return null;
	}


}
