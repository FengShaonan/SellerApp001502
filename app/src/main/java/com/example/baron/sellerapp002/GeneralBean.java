package com.example.baron.sellerapp002;

/**
 * Created by Baron on 4/22/16.
 */
public class GeneralBean {

    private int resid;
    private String name;

    public int getResid() {
        return resid;
    }
    public void setResid(int resid) {
        this.resid = resid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public GeneralBean() {
        // TODO Auto-generated constructor stub
    }
    public GeneralBean(int resid, String name) {
        super();
        this.resid = resid;
        this.name = name;
    }
    @Override
    public String toString() {
        return "GeneralBean [resid=" + resid + ", name=" + name + "]";
    }
}
