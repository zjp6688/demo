package com.example.controller;

import com.example.util.MD5Utils;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    public static void main(String[] args) {
        String passwored = MD5Utils.MD5Encode("123", "passwored");
        System.out.println(passwored);
    }
}
