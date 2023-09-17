package com.lld.design.behavioural.observer.bitcoin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class BitcoinTest {

    BitcoinMananger bitcoinMananger;
    Consumer emailConsumer;
    Consumer smsConscumer;
    @BeforeEach
    public void setUp() {
        bitcoinMananger = new BitcoinMananger(new Bitcoin(100.0));
        emailConsumer = new EmailConsumer();
        smsConscumer = new SMSConsumer();
        bitcoinMananger.addConsumer(emailConsumer);
        bitcoinMananger.addConsumer(smsConscumer);
    }

    @Test
    public void testPublish() {
        bitcoinMananger.setBitcoin(90.0);
    }

    @Test
    public void testRemovalOfConscumer() {
        bitcoinMananger.removeConsumer(emailConsumer);
        bitcoinMananger.setBitcoin(90.0);
    }
}
