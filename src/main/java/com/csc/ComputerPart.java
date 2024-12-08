package com.csc;

public class ComputerPart implements Name{
    private String part;

    public ComputerPart(String part) {
        this.part = part;
    }

    @Override
    public String getName() {
        return this.part;
    }
}
