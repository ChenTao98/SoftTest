package com.softtest.softtest.entity;

public class Contesttable {
    private String a;

    public Contesttable(String a) {
        this.a = a;
    }

    public Contesttable() {
        super();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }
}