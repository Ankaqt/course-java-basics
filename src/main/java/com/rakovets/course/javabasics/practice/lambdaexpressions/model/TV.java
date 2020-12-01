package com.rakovets.course.javabasics.practice.lambdaexpressions.model;

public class TV {
    private String producer;
    private String modelName;
    private Integer yearOfIssue;
    private Integer diagonal;
    private Integer price;

    public TV(String producer, String modelName, Integer yearOfIssue, Integer diagonal, Integer price) {
        this.producer = producer;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return producer + " " + modelName + " " + diagonal + " " + yearOfIssue + " " + price + "RUB";
    }
}
