package com.lld.design.structural.decorator.database;

//Step 2 - Concrete product class
public class FileDataSource implements DataSource {
    @Override
    public void write(String value) {
        System.out.println(value);
    }

    @Override
    public String read() {
        return "Base";
    }
}
