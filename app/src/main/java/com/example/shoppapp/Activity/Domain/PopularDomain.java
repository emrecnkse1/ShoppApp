package com.example.shoppapp.Activity.Domain;

import java.io.Serializable;

public class PopularDomain implements Serializable {
    private String title;
    private String description;
    private String picUrl;
    private int review;
    private double score;
    private double price;
    private int numberinCart;

    public PopularDomain(String title, String description, String picUrl, int review, double score, double price, int numberinCart) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.review = review;
        this.score = score;
        this.price = price;
        this.numberinCart = numberinCart;
    }

    public PopularDomain(String title, String description, String picUrl, int review, double score, double price) {
        this(title, description, picUrl, review, score, price, 0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberinCart() {
        return numberinCart;
    }

    public void setNumberinCart(int numberinCart) {
        this.numberinCart = numberinCart;
    }
}
