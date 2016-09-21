package com.aac.framework.service;

import java.util.List;
import java.util.Map;

import com.aac.framework.entity.MUser;
import com.aac.framework.exception.ServiceException;

public interface MUserService {

	MUser getUser(String id) throws ServiceException;
	
	MUser getUser(MUser user) throws ServiceException;
	
	MUser addUser(MUser user) throws ServiceException;
	
	List<MUser> addUser(List<MUser> users) throws ServiceException;
	
	int deleteUser(String id) throws ServiceException;

	List<MUser> getUserList(MUser mUser, Integer pageNum, Integer pageSize) throws ServiceException;

	Map<String, Object> getUserPage(MUser mUser, Integer pageNum, Integer pageSize) throws ServiceException;

	MUser updateUser(MUser user) throws ServiceException;

	MUser login(String username, String password) throws ServiceException;

}
