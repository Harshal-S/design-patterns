package com.lld.design.behavioural.observer.bitcoin;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BitcoinMananger extends Publisher {
    Bitcoin bitcoin;

    public void setBitcoin(Double price) {
        if (bitcoin.getPrice() - price > 5) {
            publish(price);
        }
        bitcoin.setPrice(price);
    }

}
