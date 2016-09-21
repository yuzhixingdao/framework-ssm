package com.aac.framework.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aac.framework.common.util.encryption.MD5Util;
import com.aac.framework.dao.MUserDao;
import com.aac.framework.entity.MUser;
import com.aac.framework.exception.ServiceException;
import com.aac.framework.service.MUserService;

@Service("muserService")
public class MUserServiceImpl implements MUserService {

	@Autowired
	private MUserDao muserDao;
	
	public MUser login(String username, String password) throws ServiceException {
		if (username != null && !"".equals(username) && password != null && !"".equals(password)) {
			MUser user = new MUser();
			user.setLoginName(username);
			user.setPassword(MD5Util.encrypt(password + username));
			return (MUser) muserDao.selectOne("muserMapper.selectLogin", user);
		}
		return null;
	}
	
	
	public MUser getUser(String id) throws ServiceException {
		return (MUser) muserDao.selectOne("muserMapper.selectOne", id);
	}

	
	
	public MUser getUser(MUser user) throws ServiceException {
		return (MUser) muserDao.selectOne("muserMapper.selectList", user);
	}


	
	public MUser addUser(MUser user) throws ServiceException {
		if (user != null) {
			return muserDao.insert("muserMapper.insert", user);
		}
		return null;
	}


	
	public int deleteUser(String id) throws ServiceException {
		if (id != null && !"".equals(id)) {
			return muserDao.delete("muserMapper.delete", id);
		}
		return 0;
	}


	
	public List<MUser> addUser(List<MUser> users) throws ServiceException {
		if (users != null && users.size() > 0) {
			for (int i = 0; i < users.size(); i++) {
				MUser user = users.get(i);
				if (user != null) {
					user = muserDao.insert("muserMapper.insert", user);
				}
			}
		}
		return users;
	}


	
	public List<MUser> getUserList(MUser mUser, Integer pageNum,
			Integer pageSize) throws ServiceException {
		return muserDao.selectListEntity("muserMapper.selectList", mUser, pageNum, pageSize);
	}


	
	public Map<String, Object> getUserPage(MUser mUser, Integer pageNum,
			Integer pageSize) throws ServiceException {
		// return muserDao.selectPageEntity("muserMapper.selectList", "muserMapper.selectListCount", mUser, pageNum, pageSize);
		return muserDao.selectPageEntity("muserMapper.selectList", mUser, pageNum, pageSize);
	}


	
	public MUser updateUser(MUser user) throws ServiceException {
		if (user != null && user.getId() != null && !"".equals(user.getId())) {
			user.setUpdateDate(new Date());
			return muserDao.update("muserMapper.update", user);
		}
		return null;
	}


}
