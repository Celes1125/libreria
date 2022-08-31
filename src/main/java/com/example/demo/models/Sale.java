package com.example.demo.models;

import java.util.Date;

public class Sale extends Movement{
    public int saleId;

    public Sale(String type, int id, User seller, User client, Product product, Date date, int saleId) {
        super(type, id, seller, client, product, date);
        this.saleId = saleId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                '}';
    }
}
