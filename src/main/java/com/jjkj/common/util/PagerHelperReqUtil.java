package com.jjkj.common.util;

import java.io.Serializable;

import org.apache.log4j.Logger;

/**
 * Pager Helper Req Util if occur error,set default value
 * 
 * @author jjkjdebby@gmail.com
 *
 */
public class PagerHelperReqUtil implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -2065113665007211129L;

    Logger logger = Logger.getLogger(PagerHelperReqUtil.class);

    /** number 页面大小。 DEFAULT 10 */
    private String pageSize = "10";
    /** number 在分页控件创建的时候显示的页数。DEFAULT 1 */
    private String pageNumber = "1";

    public String getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(String pageSize)
    {
        if (null == pageSize || "".equals(pageSize))
        {
            this.pageSize = "" + 10;
        }
        else
        {

            try
            {
                Integer.valueOf(pageNumber);
                this.pageSize = pageSize;
            }
            catch (NumberFormatException e)
            {
                logger.error(e.getMessage());
                logger.error("pageSize SET deault value:  10");
                this.pageSize = "" + 10;
            }

        }
    }

    public String getPageNumber()
    {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber)
    {

        if (null == pageNumber || "".equals(pageNumber))
        {
            this.pageNumber = "" + 1;
        }
        else
        {

            try
            {
                Integer.valueOf(pageNumber);
                this.pageNumber = pageNumber;
            }
            catch (NumberFormatException e)
            {
                logger.error(e.getMessage());
                logger.error("pageNumber SET deault value:  1");
                this.pageNumber = "" + 1;
            }

        }

    }

}
