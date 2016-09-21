package com.aac.framework.dao.impl;

import org.springframework.stereotype.Repository;

import com.aac.framework.dao.MUserDao;
import com.aac.framework.persistence.impl.BaseMybatisDaoImpl;

@Repository(value = "muserDao")
public class MUserDaoImpl extends BaseMybatisDaoImpl implements MUserDao {

}
