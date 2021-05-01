package com.javatechie.crud.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;
    private int customerId;
    private Date orderDate;
    private int status;
    private String comments;
    private Date shippedDate;
    private Integer shipperId;

    public Order() {
    }

    public Order(int customerId, Date orderDate, int status, String comments, Date shippedDate, int shipperId) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.status = status;
        this.comments = comments;
        this.shippedDate = shippedDate;
        this.shipperId = shipperId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }
}
