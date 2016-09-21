package com.aac.framework.persistence;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.aac.framework.exception.DAOException;

public interface BaseMybatisDao {

	<ENTITY> ENTITY selectOne(String statement, ENTITY entity) throws DAOException;
	
	Object selectOne(String statement, Serializable id) throws DAOException;
	
	<ENTITY> ENTITY insert(String statement, ENTITY entity) throws DAOException;
	
	<ENTITY> ENTITY update(String statement, ENTITY entity) throws DAOException;
	
	int delete(String statement, Serializable id) throws DAOException;
	
	<ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, Integer pageNum, Integer pageSize) throws DAOException;
	
	<ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity) throws DAOException;
	
	<ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, Map<String, Object> map) throws DAOException;
	
	<ENTITY> List<ENTITY> selectListEntity(String statement, ENTITY entity, List<Long> list) throws DAOException;
	
	<ENTITY> Map<String, Object> selectPageEntity(String statement, String statementCount, ENTITY entity, Integer pageNum, Integer pageSize) throws DAOException;
	
	<ENTITY> Map<String, Object> selectPageEntity(String statement, ENTITY entity, Integer pageNum, Integer pageSize) throws DAOException;
	
	<ENTITY> int selectCount(String statement, ENTITY entity) throws DAOException;
	
	int selectCount(String statement, Map<String, Object> map) throws DAOException;
	
	List<Map<String, Object>> selectListMap(String statement, Map<String, Object> map) throws DAOException;
	
	Map<String, Object> selectPageMap(String statement, Map<String, Object> map, Integer pageNum, Integer pageSize) throws DAOException;
	
}
