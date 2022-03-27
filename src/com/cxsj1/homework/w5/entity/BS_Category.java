package com.cxsj1.homework.w5.entity;

public class BS_Category {
    private int c_ID;
    private String c_Name;
    private int c_PID;
    public BS_Category(int c_id, String c_name, int c_pid){
        super();
        c_ID = c_id;
        c_Name = c_name;
        c_PID = c_pid;

    }

    public int getC_ID() {
        return c_ID;
    }

    public void setC_ID(int c_ID) {
        this.c_ID = c_ID;
    }

    public String getC_Name() {
        return c_Name;
    }

    public void setC_Name(String c_Name) {
        this.c_Name = c_Name;
    }

    public int getC_PID() {
        return c_PID;
    }

    public void setC_PID(int c_PID) {
        this.c_PID = c_PID;
    }
}
