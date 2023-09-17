package com.lld.design.structural.decorator.database;

//Step 1 create a product interface
public interface DataSource {
    public abstract void write(String value);

    public abstract String read();
}
