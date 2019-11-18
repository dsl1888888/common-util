package com.jjkj.common.util;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Pager Helper Resp Util
 * 
 * @author jjkjdebby@gmail.com
 *
 * @param <T>
 */
public class PagerHelperRespUtil<T> implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 110978330509618479L;

    Logger logger = Logger.getLogger(PagerHelperRespUtil.class);

    /** number 总记录数，在分页控件创建时初始的值。 1 */
    private Integer total;
    /** number 页面大小。 10 */
    private Integer pageSize;
    /** number 在分页控件创建的时候显示的页数。 1 */
    private Integer pageNumber;
    /** array 用户可以改变页面大小。pageList属性定义了页面导航展示的页码。 [10,20,30,50] */
    /**
     * 代码示例：
     * 
     * $('#pp').pagination({ pageList: [10,20,50,100] });
     */
    private List<T> pageList;

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber)
    {
        this.pageNumber = pageNumber;
    }

    public List<T> getPageList()
    {
        return pageList;
    }

    public void setPageList(List<T> pageList)
    {
        this.pageList = pageList;
    }

    @Override
    public String toString()
    {
        return "PagerHelper [total=" + total + ", pageSize=" + pageSize + ", pageNumber=" + pageNumber + ", pageList="
                + pageList + "]";
    }

}
