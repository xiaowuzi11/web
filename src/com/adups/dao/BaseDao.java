package com.adups.dao;

import java.util.List;

public interface BaseDao<T>
{
	/***
	 * test git for eclipse form remote repository
	 * @return
	 */
	public List<T> queryForObjectList();
	
	public T getObject(Integer id);
	
	public List<T> queryForBrantch(String sql,Object ...argsments);
	

}
