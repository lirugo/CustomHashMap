package com.lirugo.hash_map;

class Main {
    public static void main(String[] args){
        HashMap m = new HashMap();

        System.out.println(21&2);
    }
}

interface IHashMap {
    void put();
    void get();
    int size();
}

class HashMap implements IHashMap {

    public HashMap() {
    }

    @java.lang.Override
    public void put() {
    }

    @java.lang.Override
    public void get() {

    }

    @java.lang.Override
    public int size() {
        return 0;
    }
}

class Node {
    private int hash;
    private int key;
    private long value;
    private Node next;
}

class Key {
    private int key;

    public Key(int key){
        this.key = key;
    }

    @java.lang.Override
    public boolean equals(Object object) {
        Key key1 = (Key) object;
        return key == key1.key;
    }

    @java.lang.Override
    public int hashCode() {
        return this.key;
    }
}