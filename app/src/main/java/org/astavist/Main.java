package org.astavist;

public class Main {
    public static void main(String[] args) {
        SimpleHttpServer server = new SimpleHttpServer(8080);
        System.out.println("Hello world!");
    }
}