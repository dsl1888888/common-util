package com.artworld.common.base.dto;

import org.apache.commons.lang3.StringUtils;

import com.artworld.common.constant.Constants;
import com.artworld.common.entity.Page;

public abstract class BaseDTO
{
    /**
     * 分页参数
     */
    protected Page page;

    /**
     * 关键字
     */
    protected String keywords;

    public Page getPage()
    {
        if (page == null)
        {
            page = new Page(Constants.DEFAULT_CURRENT_PAGE, Constants.DEFAULT_PAGE_SIZE);
        }
        if (page.getPageNum() == null)
        {
            page.setPageNum(Constants.DEFAULT_CURRENT_PAGE);
        }
        if (page.getPageSize() == null)
        {
            page.setPageSize(Constants.DEFAULT_PAGE_SIZE);
        }
        return page;
    }

    public void setPage(Page page)
    {
        this.page = page;
    }

    /**
     * 获得关键字
     */
    public String getKeywords()
    {
        return keywords;
    }

    /**
     * 设置关键字
     */
    public void setKeywords(final String keywords)
    {
        this.keywords = StringUtils.isBlank(keywords) ? null : keywords.trim();
    }

}
