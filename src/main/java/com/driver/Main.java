package com.driver;

public class Main {
    public static void main(String[] args) {
            Product p = new Product();

            int a = p.product(10, 20);
            int b = p.product(10,20,30);
            double c = p.product(10.0, 10.5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

     public static class Product
    {

        public int product(int x, int y) { return x*y;}
        public int product(int x, int y, int z) {return x*y*z;}
        public double product(double x, double y) {return x*y;}
    }
}