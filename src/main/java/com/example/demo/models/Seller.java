package com.example.demo.models;

public class Seller extends User{
    public int sellerId;
    private int salesAmount;

    public Seller(String name, String lastName, String email, String password, String birthday, int sellerId, int salesAmount) {
        super(name, lastName, email, password, birthday);
        this.sellerId = sellerId;
        this.salesAmount = salesAmount;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", salesAmount=" + salesAmount +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}


