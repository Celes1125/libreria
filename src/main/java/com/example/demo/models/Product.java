package com.example.demo.models;

import java.util.Date;

public class Product {
    private int id;
    private String Category;
    private String title;
    private String author;
    private String publisher;
    private Date date;
    private int ISBN;
    private String url;
    private double price;
    private int stock;

    public Product(int id, String category, String title, String author, String publisher, Date date, int ISBN, String url, double price, int stock) {
        this.id = id;
        Category = category;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.ISBN = ISBN;
        this.url = url;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Category='" + Category + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", date=" + date +
                ", ISBN=" + ISBN +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
