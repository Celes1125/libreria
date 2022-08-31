package com.example.demo.models;

import java.util.Date;

public class Purchase extends Movement{
    public int purchaseId;

    public Purchase(String type, int id, User seller, User client, Product product, Date date, int purchaseId) {
        super(type, id, seller, client, product, date);
        this.purchaseId = purchaseId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId=" + purchaseId +
                '}';
    }
}
