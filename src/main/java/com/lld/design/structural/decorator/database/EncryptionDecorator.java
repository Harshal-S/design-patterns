package com.lld.design.structural.decorator.database;

// Step 4 - Create concrete decorators
public class EncryptionDecorator extends BaseDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String value) {
        String encryptedValue = encrypt(value);
        dataSource.write(encryptedValue);
    }

    @Override
    public String read() {
        String value = dataSource.read();
        return decrypt(value);
    }

    private String encrypt(String value) {
        return value + " - Encyrpted";
    }

    private String decrypt(String value) {
        return value + " - Decrypted";
    }
}
