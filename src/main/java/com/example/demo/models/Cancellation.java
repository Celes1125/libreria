package com.example.demo.models;

import java.util.Date;

public class Cancellation extends Movement {
    public int cancellationId;

    public Cancellation(String type, int id, User seller, User client, Product product, Date date, int cancellationId) {
        super(type, id, seller, client, product, date);
        this.cancellationId = cancellationId;
    }

    public int getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(int cancellationId) {
        this.cancellationId = cancellationId;
    }

    @Override
    public String toString() {
        return "Cancellation{" +
                "cancellationId=" + cancellationId +
                '}';
    }
}
