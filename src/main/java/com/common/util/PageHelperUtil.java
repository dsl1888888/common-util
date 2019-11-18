package com.common.util;

public class PageHelperUtil {

    private Integer page = 1;
    private Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public PageHelperUtil() {
    }

    public PageHelperUtil(Integer page, Integer rows) {
        this.page = page;
        this.rows = rows;
    }
}
