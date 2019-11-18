package com.jjkj.common.util;

import java.io.Serializable;

public class PageMiniUtil implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -1792945250423894579L;

    private Integer pageNo = 1;
    private Integer pageSize = 10;

    public Integer getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(Integer pageNo)
    {
        this.pageNo = pageNo;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

}
