package com.csc;

public class StrawHat implements Name {
    private String name;

    public StrawHat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
