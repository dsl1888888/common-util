/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.artworld.common.base.mapper;

import java.util.List;

/**
 * 
 * @author Administrator dorosdebby@gmail.com
 *
 * @param <T>
 */
public interface BasicMapper<T>
{

	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	T selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(T record);

	int batchDelete(Integer[] ids);

	int batchInsert(List<T> recordList);

	int batchUpdate(List<T> recordList);

}