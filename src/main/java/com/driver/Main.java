package com.driver;

public class Main {
    public static void main(String[] args) {
//        RWOnly ex = new RWOnly("Mahesh");
        RWOnly ex = new RWOnly();
//      'name' has private access in 'enc.RWOnly'
//      java: name has private access in enc.RWOnly
//      Using getter
        ex.setName("Susanta");
        System.out.println( ex.getName());
        ex.setName("Accio Job");
        System.out.println( ex.getName());
    }
}