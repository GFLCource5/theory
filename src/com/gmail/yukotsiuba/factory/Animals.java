package com.gmail.yukotsiuba.factory;

public enum  Animals {
    CAT("cat"),
    DOG("dog");

    private String kind;

    Animals(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}
