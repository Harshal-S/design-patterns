package com.lld.design.structural.decorator.database;

public class CompressionDecorator extends BaseDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String value) {
        String encryptedValue = compress(value);
        dataSource.write(encryptedValue);
    }

    private String compress(String value) {
        return value + " - Compressed";
    }

    @Override
    public String read() {
        String value = dataSource.read();
        return decmopress(value);
    }

    private String decmopress(String value) {
        return value + " - Decompressed";
    }
}
