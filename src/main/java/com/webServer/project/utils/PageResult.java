package com.webServer.project.utils;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页工具类不知道能否试用需要具体测试
 * @param <T>
 */
public class PageResult<T> extends Result {

    private PageInfo<T> pageInfo;
    private List<T> list;

    public PageResult(PageInfo<T> pageInfo, List<T> list) {
        this.pageInfo = pageInfo;
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageResult() {
    }

    public PageResult(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }

    public PageResult (boolean flag, Integer code, String message){
        super(flag,code,message);
    }
}
