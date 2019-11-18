package com.artworld.common.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.artworld.common.base.mapper.BasicMapper;
import com.artworld.common.base.service.BasicService;

public class BasicServiceImpl<D extends BasicMapper<T>, T> implements BasicService<T>
{

    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;

    @Override
    public int insert(T record)
    {

        return dao.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id)
    {

        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(T record)
    {

        return dao.updateByPrimaryKey(record);
    }

    @Override
    public T selectByPrimaryKey(Integer id)
    {

        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int batchDelete(Integer[] ids)
    {

        return dao.batchDelete(ids);
    }

    @Override
    public int batchInsert(List<T> recordList)
    {

        return dao.batchInsert(recordList);
    }

    @Override
    public int batchUpdate(List<T> recordList)
    {

        return dao.batchUpdate(recordList);
    }

}
