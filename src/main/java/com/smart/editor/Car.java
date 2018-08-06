package com.smart.editor;

public class Car {

  public String brand;
  private int maxSpeed;
  private double price;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "brand:" + brand + "/maxSpeed:" + maxSpeed + "/price:" + price;
  }
}
