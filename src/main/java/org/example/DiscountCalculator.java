package org.example;

public class DiscountCalculator {

    public DiscountCalculator() {}
    public double calculateFinalPrice(double price , double discountPercent) {
        if (discountPercent < 0.0 || discountPercent > 100.0) {
            throw new  IllegalArgumentException("Discount percent must be between 0.0 and 100.0");
        }
        double discount= (price * (discountPercent/100));
        return price - discount;

    }
}
