package com.jobportal.util;

public class TestConnection {
    public static void main(String[] args) {
        System.out.println(DBConnection.getConnection() != null ? "Connected" : "Failed");
    }
}
