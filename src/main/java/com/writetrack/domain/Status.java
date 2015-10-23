package com.writetrack.domain;

public enum Status {
    FAIL("fail"),
    SUCCESS("success");

    private final String text;

    private Status(String text) {
        this.text = text;
    }

    public String getValue() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
