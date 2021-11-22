package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class FortuneCookie {

    private static ResourceBundle messages = ResourceBundle.getBundle("resources.FortuneCookie");

    public static ArrayList<String> bakeCookies() {

        ArrayList<String> cookie = new ArrayList<String>();
        cookie.add(messages.getString("1"));
        cookie.add(messages.getString("2"));
        cookie.add(messages.getString("3"));
        cookie.add(messages.getString("4"));
        cookie.add(messages.getString("5"));
        cookie.add(messages.getString("6"));
        cookie.add(messages.getString("7"));
        cookie.add(messages.getString("8"));
        cookie.add(messages.getString("9"));
        cookie.add(messages.getString("10"));
        cookie.add(messages.getString("11"));
        cookie.add(messages.getString("12"));
        return cookie;
    }
    public static String pickACookie(ArrayList<String> cookies){
        if(cookies.size() < 1 ){
            return messages.getString("noCookies");
        }
        Random random = new Random();
        int cookie =  random.nextInt(cookies.size());
        String message = cookies.get(cookie);
        cookies.remove(cookie);
        return message;

    }


    public static void main(String[] args) {
        ArrayList<String> cookies = bakeCookies();
        while(cookies.size() > 0 ){
            System.out.println(pickACookie(cookies));
        }
        System.out.println(pickACookie(cookies));

    }
}
