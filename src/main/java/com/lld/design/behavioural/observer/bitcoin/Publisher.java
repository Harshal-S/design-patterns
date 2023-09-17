package com.lld.design.behavioural.observer.bitcoin;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    List<Consumer> consumers = new ArrayList<Consumer>();

    protected void publish(Double price) {
        consumers.forEach(consumer -> consumer.consume(price));
    }

    protected void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    protected void removeConsumer(Consumer consumer) {
        consumers.remove(consumer);
    }
}
