package com.ehr.model;

import lombok.Data;

import java.util.List;

/**
 * Created by cheng on 2016/6/17.
 */
@Data
public class PageListVO<T> {
    //数据列表
    private List<T> rows;
    //当前页
    private String page;
    //总页数
    private String total;
    //总行数
    private String records;

    private int limit;

    private int offset;

    public void config(int limit,String page,String records){
        this.limit = limit;
        this.records = records;
        this.page = page;
        this.total = ""+(Integer.parseInt(records) % limit == 0 ?
                Integer.parseInt(records)/ limit : Integer.parseInt(records) / limit+ 1);
        this.offset = (Integer.parseInt(page) - 1) * limit;

    }
}
