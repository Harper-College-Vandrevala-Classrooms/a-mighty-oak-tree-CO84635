package com.csc;

public class Squirrel implements Name {
    private String name;

    public Squirrel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
