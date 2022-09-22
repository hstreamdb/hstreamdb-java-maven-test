package org.example;

import io.hstream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        final String serviceUrl = "127.0.0.1:6570";
        HStreamClient client = HStreamClient.builder().serviceUrl(serviceUrl).build();
        System.out.println("Connected");
    }
}