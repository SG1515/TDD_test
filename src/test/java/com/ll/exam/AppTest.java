package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void 테스트 (){
        int rs  = Calculator.add("1 + 1");

        assertEquals(2, rs);
    }

    @Test
    public void 테스트_2 (){
        int rs  = Calculator.add("1 + 2");

        assertEquals(3, rs);
    }
    @Test
    public void 테스트_3 (){
        int rs  = Calculator.sub("1 - 2");

        assertEquals(0, rs);
    }

    @Test
    public void 테스트_4 (){
        int rs  = Calculator.mul("1 * 2");

        assertEquals(2, rs);
    }
    @Test
    public void 테스트_5 (){
        int rs  = Calculator.add("4 / 2");

        assertEquals(60, rs);
    }
    @Test
    public void 테스트_6 (){
        int rs  = Calculator.add("1 + 2 + 3");

        assertEquals(60, rs);
    }
    @Test
    public void 테스트_7 (){
        int rs  = Calculator.add("1 + 2 * 3");

        assertEquals(60, rs);
    }
    @Test
    public void 테스트_8 (){
        int rs  = Calculator.add("(1 + 2) * 3");

        assertEquals(60, rs);
    }



}
