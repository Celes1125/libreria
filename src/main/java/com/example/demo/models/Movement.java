package com.example.demo.models;

import java.util.Date;

public class Movement {

    private String type;
    private int id;
    private User seller;
    private User client;
    private Product product;
    private Date date;


    public Movement(String type, int id, User seller, User client, Product product, Date date) {
        this.type = type;
        this.id = id;
        this.seller = seller;
        this.client = client;
        this.product = product;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", seller=" + seller +
                ", client=" + client +
                ", product=" + product +
                ", date=" + date +
                '}';
    }
}
