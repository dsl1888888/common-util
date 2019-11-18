package com.artworld.common.base.service.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.artworld.common.base.dto.BaseDTO;
import com.artworld.common.base.entity.BaseEntity;
import com.artworld.common.base.mapper.BaseMapper;
import com.artworld.common.base.service.BaseService;
import com.artworld.common.constant.Constant;
import com.artworld.common.exception.BussinessException;


@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BaseServiceImpl<D extends BaseMapper<T, V>, T extends BaseEntity<T>, V extends BaseDTO> implements BaseService<T, V> {


	protected Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 持久层对象
     */
    @Autowired
    protected D dao;

    @Override
    public T get(String id) {
        return dao.get(id);
    }

    @Override
    public List<T> findList(V model) {
        return dao.findList(model);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    @Override
    public int getCount(V model) {
        return dao.getCount(model);
    }

    /***************************** 增删改操作 *****************************/

    @Transactional(readOnly = false)
    @Override
	public int insert(T entity) {
        entity.preInsert();
		int insert = dao.insert(entity);
		return insert;
    }

    @Transactional(readOnly = false)
    @Override
	public int insertBatch(List<T> list) {

		int count = 0;

		if (CollectionUtils.isEmpty(list)) {

			return count;
        }
        //批量提交的子列表
        List<T> subList = new ArrayList<T>();
        for (final T t : list) {
            t.preInsert();
            subList.add(t);
            //子列表已满,批量提交
            if (subList.size() == Constant.BATCH_OPERATION_COUNT) {
				int insertBatch = dao.insertBatch(subList);
				if (0 < insertBatch) {
					count++;
				}
                subList = new ArrayList<T>();


            }
        }
        //子列表未满的部分,做一次批量提交
        if (subList.size() > 0 && subList.size() < Constant.BATCH_OPERATION_COUNT) {
			int insertBatch = dao.insertBatch(subList);
			if (0 < insertBatch) {
				count++;
			}
        }

		return count;
    }

    @Transactional(readOnly = false)
    @Override
	public int save(T entity) {
        int result = 0;
        entity.preInsert();
        result = dao.insert(entity);
        if (result == Constant.INT_ZERO) {
            throw new BussinessException("No saved records");
        }

		return result;
    }



    @Transactional(readOnly = false)
    @Override
	public int update(T entity) {
        entity.preUpdate();
        int result = dao.update(entity);
        if (result == Constant.INT_ZERO) {
            throw new BussinessException("No updated records");
        }
		return result;
    }

    @Transactional(readOnly = false)
    @Override
	public int updateBatch(List<T> list) {

		int count = 0;

        if (CollectionUtils.isEmpty(list)) {
			return count;
        }
        //批量提交的子列表
        List<T> subList = new ArrayList<T>();
        for (final T t : list) {
            t.preUpdate();
            subList.add(t);
            //子列表已满,批量提交
            if (subList.size() == Constant.BATCH_OPERATION_COUNT) {
                int result = dao.updateBatch(subList);
                if (result == Constant.INT_ZERO) {
                    throw new BussinessException("No updated records");
                }
                subList = new ArrayList<T>();

				if (0 < result) {
					count++;
				}
            }
        }
        //子列表未满的部分,做一次批量提交
        if (subList.size() > 0 && subList.size() < Constant.BATCH_OPERATION_COUNT) {
            int result = dao.updateBatch(subList);
            if (result == Constant.INT_ZERO) {
                throw new BussinessException("No updated records");
            }
			if (0 < result) {
				count++;
			}
        }
		return count;
    }

    @Transactional(readOnly = false)
    @Override
	public int delete(final String id) {
        int result = dao.delete(id);
        if (result == Constant.INT_ZERO) {
            throw new BussinessException("Record not deleted, id=" + id);
        }
		return result;
    }

    @Transactional(readOnly = false)
    @Override
	public int deleteBatch(final String[] ids) {
        int result = dao.deleteBatch(ids);
        if (result == Constant.INT_ZERO) {
            throw new BussinessException("Records not deleted, ids=" + Arrays.toString(ids));
        }
		return result;
    }

    @Transactional(readOnly = false)
    @Override
	public int deleteLogic(final String id) {
        final int result = dao.deleteLogic(id);
        if (result == Constant.INT_ZERO) {
            throw new BussinessException("Record not deleted, id=" + id);
        }
        
		return result;
    }


}
