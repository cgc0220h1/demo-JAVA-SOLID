package com.solid.isp;

public class Page<T> {
    private String page;

    public Page(String page) {
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
