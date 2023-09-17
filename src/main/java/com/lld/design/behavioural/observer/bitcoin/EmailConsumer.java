package com.lld.design.behavioural.observer.bitcoin;

public class EmailConsumer implements Consumer {
    @Override
    public void consume(Double price) {
        System.out.println("Email notification sent for price: "+ price);
    }
}
