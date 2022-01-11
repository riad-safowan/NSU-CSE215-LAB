package com.riadsafowan.java.discord;

import java.math.BigInteger;

class rafi {
    String s;

    public rafi(String s) {
        this.s = s;
    }
}

public class q2 {
    public static void main(String[] args) {
        rafi r = new rafi("asdf");
        r.s = "sadf";
        j(r);
        System.out.println(r.s);
    }

    private static void j(rafi r) {
        r.s = "123432";
    }
}
