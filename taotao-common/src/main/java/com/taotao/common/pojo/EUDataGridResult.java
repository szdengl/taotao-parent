package com.taotao.common.pojo;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-16 10:53
 **/
public class EUDataGridResult {
    private long total;
    private List<?> rows;
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
