package com.artworld.common.base.entity;




import java.io.Serializable;


/**
 * Entity 基类
 */

public abstract class BaseEntity<T> implements Serializable {

    /**
     * 保存数据库前预处理
     */
    public void preInsert() {
    }

    /**
     * 保存数据库前预更新
     */
    public void preUpdate() {
    }


}