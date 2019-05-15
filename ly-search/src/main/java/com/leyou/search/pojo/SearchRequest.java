package com.leyou.search.pojo;

import java.util.Map;

/**
 * @author itsNine
 * @create 2019-04-09-21:43
 */
public class SearchRequest {
    private String key;//搜索字段

    private Integer page;//当前页

    private Map<String,String> filter;

    private static final int DEFAULT_SIZE = 20;//每页大小，不能从页面接受，而是固定大小 防止用户输入数据过大导致数据库崩溃
    private static final int DEFAULT_PAGE = 1;//默认页

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        if (page == null){
            return DEFAULT_PAGE;
        }
        //获取页码时做一些校验，不能小于1
        return Math.max(DEFAULT_PAGE,page);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public static int getSize() {
        return DEFAULT_SIZE;
    }

    public Map<String, String> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, String> filter) {
        this.filter = filter;
    }
}
