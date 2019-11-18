package com.artworld.common.base.service;

import java.util.List;

/**
 * Service基类
 */
public interface BaseService<T, V> {

    /**
     * 插入数据
     */
	int insert(T entity);

	/**
	 * 批量插入
	 */
	int insertBatch(List<T> list);

	/**
	 * 删除数据
	 */
	int delete(String id);

	/**
	 * 批量删除
	 */
	int deleteBatch(String[] ids);

	/**
	 * 逻辑删除
	 */
	int deleteLogic(String id);

	/**
	 * 更新数据
	 */
	int update(T entity);

	/**
	 * 批量更新
	 */
	int updateBatch(List<T> list);

	/**
	 * 查询所有数据列表
	 */
	List<T> findAll();

	/**
	 * 查询数据列表，如果需要分页，请设置分页对象，如：model.setPage(new Page<T>());
	 */
	List<T> findList(V model);

	/**
	 * 查询数据记录
	 */
	int getCount(V model);

	/**
	 * 获取单条数据
	 */
	T get(String id);

	/**
	 * 保存数据
	 */
	int save(T entity);



}
