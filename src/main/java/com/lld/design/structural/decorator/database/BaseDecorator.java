package com.lld.design.structural.decorator.database;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//Step 3 - Base Decorator
public abstract class BaseDecorator implements DataSource {
    protected DataSource dataSource;
}
