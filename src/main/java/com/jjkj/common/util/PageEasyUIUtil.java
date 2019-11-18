package com.jjkj.common.util;

import java.io.Serializable;
import java.util.List;

public class PageEasyUIUtil<T> implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 995140618117887204L;

    private int total;

    private List<T> rows; // 返回的查询结果集  

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public List<T> getRows()
    {
        return rows;
    }

    public void setRows(List<T> rows)
    {
        this.rows = rows;
    }
    
    
}
