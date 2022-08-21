package com.spring.springbucks.work.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QueryResult<T> implements Serializable {

    private static final long serialVersionUID = -4747243863363981917L;

    private transient List<T> resultList = new ArrayList();
    private long totalRecord;

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }
}
