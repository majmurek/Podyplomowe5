package com.two;

import com.one.A;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.number = 1;
        b.name = "Tom"; //w A jek damy protected to zadziała bo dziedziczmy choć nie jesteśmy w tym samym pakiecie
    }
}
