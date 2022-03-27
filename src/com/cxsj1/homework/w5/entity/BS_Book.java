package com.cxsj1.homework.w5.entity;

public class BS_Book {
    private int b_ID;
    private String b_Name;
    private String b_Desc;
    private double b_Price;
    private int b_Stock;
    private int b_FID;
    private int b_CID;
    private String b_FileName;

    public BS_Book(int b_id, String b_name, String b_desc, double b_price, int b_stock,
                   int b_fid, int b_cid, String b_fileName){
        super();
        b_ID = b_id;
        b_Name = b_name;
        b_Desc = b_desc;
        b_Price = b_price;
        b_Stock = b_stock;
        b_FID = b_fid;
        b_CID = b_cid;
        b_FileName = b_fileName;
    }
    public int getB_ID() {
        return b_ID;
    }

    public void setB_ID(int b_ID) {
        this.b_ID = b_ID;
    }

    public String getB_Name() {
        return b_Name;
    }

    public void setB_Name(String b_Name) {
        this.b_Name = b_Name;
    }

    public String getB_Desc() {
        return b_Desc;
    }

    public void setB_Desc(String b_Desc) {
        this.b_Desc = b_Desc;
    }

    public double getB_Price() {
        return b_Price;
    }

    public void setB_Price(double b_Price) {
        this.b_Price = b_Price;
    }

    public int getB_Stock() {
        return b_Stock;
    }

    public void setB_Stock(int b_Stock) {
        this.b_Stock = b_Stock;
    }

    public int getB_FID() {
        return b_FID;
    }

    public void setB_FID(int b_FID) {
        this.b_FID = b_FID;
    }

    public int getB_CID() {
        return b_CID;
    }

    public void setB_CID(int b_CID) {
        this.b_CID = b_CID;
    }

    public String getB_FileName() {
        return b_FileName;
    }

    public void setB_FileName(String b_FileName) {
        this.b_FileName = b_FileName;
    }
}
