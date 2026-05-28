package com.greetings;

import com.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String msg = "Hello, Modules!";
        System.out.println("Original: " + msg);
        System.out.println("Reversed: " + StringUtils.reverse(msg));
    }
}
