package com.softtest.softtest.entity;

public class HibernateSequence {
    private Long nextVal;

    public HibernateSequence(Long nextVal) {
        this.nextVal = nextVal;
    }

    public HibernateSequence() {
        super();
    }

    public Long getNextVal() {
        return nextVal;
    }

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }
}