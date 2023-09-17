package com.lld.design.structural.decorator.database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DataSourceDecoratorTest {
    DataSource dataSource;

    @BeforeEach
    public void setUp() {
        dataSource = new FileDataSource();
    }

    @Test
    void testBaseDataSource() {
        String value = dataSource.read();
        assertEquals("Base", value, "If base data source is used, it should return Base");
    }

    @Test
    void testReadEncyptionDecrator() {
        DataSource encryptionDecorator = new EncryptionDecorator(dataSource);
        assertEquals(encryptionDecorator.read(), "Base - Decrypted");
    }

    @Test
    void testReadDecryptedDecompressedDecorator() {
        DataSource compressionDecorator = new CompressionDecorator(dataSource);
        DataSource encryptionDecorator = new EncryptionDecorator(compressionDecorator);
        assertEquals(encryptionDecorator.read(), "Base - Decompressed - Decrypted");
    }

    @Test
    void testWriteEncrptedCompressedDecorator() {
        Scanner sc = new Scanner(System.in);
        DataSource compressionDecorator = new CompressionDecorator(dataSource);
        DataSource encryptionDecorator = new EncryptionDecorator(compressionDecorator);
        encryptionDecorator.write("Harshal is learning");
    }
}
