package com.artworld.common.base.service;

import java.util.List;

/**
 * 
 * @author Administrator dorosdebby@gmail.com
 *
 * @param <T>
 */
public interface BasicService<T>
{
    /**
     * 插入数据
     */
    int insert(T record);

    /**
     * 删除数据
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 更新数据 ;根据主键更新
     */
    int updateByPrimaryKey(T record);

    /**
     * 获取单条数据
     */
    T selectByPrimaryKey(Integer id);

    int batchDelete(Integer[] ids);

    int batchInsert(List<T> recordList);

    int batchUpdate(List<T> recordList);

}
