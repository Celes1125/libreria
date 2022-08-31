package com.example.demo.models;

public class Client extends User {
    public int clientId;
    private Product product;
    private Purchase purchase;
    private Cancellation cancellation;

    public Client(String name, String lastName, String email, String password, String birthday) {
        super(name, lastName, email, password, birthday);
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Cancellation getCancellation() {
        return cancellation;
    }

    public void setCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", product=" + product +
                ", purchase=" + purchase +
                ", cancellation=" + cancellation +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}