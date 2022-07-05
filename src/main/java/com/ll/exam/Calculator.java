package com.ll.exam;

public class Calculator {
    public static int add(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }


    public static int sub(String s) {
        String[] sBit = s.split(" \\- ");
        int no1 = Integer.parseInt(sBit[0]);
        int no2 = Integer.parseInt(sBit[0]);


        return no1 - no2;
    }

    public static int mul(String s) {
        String[] sBit = s.split(" \\* ");
        int no1 = Integer.parseInt(sBit[0]);
        int no2 = Integer.parseInt(sBit[1]);

        return no1 * no2;
    }
}
