package com.spider.core;

/**
 * Created by huangjie on 17/2/15.
 */
public class PageBean<T> {
    private Integer pageIndex;
    private Integer pageSize;
    private Integer start;

    public PageBean() {
    }

    public void init() {
        if(null != this.pageIndex && null != this.pageSize) {
            if(this.pageIndex.intValue() >= 0 && this.pageSize.intValue() >= 0) {
                if(this.pageIndex.intValue() <= 1) {
                    this.start = Integer.valueOf(0);
                } else {
                    this.start = Integer.valueOf((this.pageIndex.intValue() - 1) * this.pageSize.intValue());
                }

            } else {
                this.start = null;
            }
        } else {
            this.start = null;
        }
    }

    public static Integer calcPageCount(Integer count, Integer pageSize) {
        return null != count && null != pageSize?(pageSize.intValue() <= 0?Integer.valueOf(0):Integer.valueOf((count.intValue() - 1) / pageSize.intValue() + 1)):Integer.valueOf(0);
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        this.init();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        this.init();
    }

    public Integer getStart() {
        return this.start;
    }
}
