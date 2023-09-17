package com.lld.design.behavioural.observer.bitcoin;

public class SMSConsumer implements Consumer {
    @Override
    public void consume(Double price) {
        System.out.println("SMS notification sent for price: " + price);
    }
}
