package com.aac.framework.dao.impl;

import org.springframework.stereotype.Repository;

import com.aac.framework.dao.SysDao;
import com.aac.framework.persistence.impl.BaseMybatisDaoImpl;

@Repository(value="sysDao")
public class SysDaoImpl extends BaseMybatisDaoImpl implements SysDao {

}
