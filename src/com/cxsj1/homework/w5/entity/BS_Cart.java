package com.cxsj1.homework.w5.entity;

public class BS_Cart {
    private int c_ID;
    private String c_FileName;
    private String c_Name;
    private double c_Price;
    private int c_Num;
    private int c_Stock;
    private int c_BID;
    private String c_UID;
    private int c_Valid;

    public BS_Cart(int c_ID, String c_FileName, String c_Name, double c_Price,
                   int c_Num, int c_Stock, int c_BID, String c_UID, int c_Valid) {
        this.c_ID = c_ID;
        this.c_FileName = c_FileName;
        this.c_Name = c_Name;
        this.c_Price = c_Price;
        this.c_Num = c_Num;
        this.c_Stock = c_Stock;
        this.c_BID = c_BID;
        this.c_UID = c_UID;
        this.c_Valid = c_Valid;
    }

    public int getC_ID() {
        return c_ID;
    }

    public void setC_ID(int c_ID) {
        this.c_ID = c_ID;
    }

    public String getC_FileName() {
        return c_FileName;
    }

    public void setC_FileName(String c_FileName) {
        this.c_FileName = c_FileName;
    }

    public String getC_Name() {
        return c_Name;
    }

    public void setC_Name(String c_Name) {
        this.c_Name = c_Name;
    }

    public double getC_Price() {
        return c_Price;
    }

    public void setC_Price(double c_Price) {
        this.c_Price = c_Price;
    }

    public int getC_Num() {
        return c_Num;
    }

    public void setC_Num(int c_Num) {
        this.c_Num = c_Num;
    }

    public int getC_Stock() {
        return c_Stock;
    }

    public void setC_Stock(int c_Stock) {
        this.c_Stock = c_Stock;
    }

    public int getC_BID() {
        return c_BID;
    }

    public void setC_BID(int c_BID) {
        this.c_BID = c_BID;
    }

    public String getC_UID() {
        return c_UID;
    }

    public void setC_UID(String c_UID) {
        this.c_UID = c_UID;
    }

    public int getC_Valid() {
        return c_Valid;
    }

    public void setC_Valid(int c_Valid) {
        this.c_Valid = c_Valid;
    }
}
