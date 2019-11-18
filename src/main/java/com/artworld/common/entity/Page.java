package com.artworld.common.entity;




import java.io.Serializable;

/**
 */

public class Page implements Serializable {


    private Integer pageNum;
 

    private Integer pageSize;


   
    private String sort;

     
    private String by;
 

    private String order;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Page(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Page() {

    }
}
