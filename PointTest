package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {
    @Test
    public void getDistanceTest() throws Exception{
        Point myPoint = new Point("a1",2,2);
        Point myPointSecond = new Point("a2",3,3);
        int result = myPoint.getDistance(myPointSecond);
        assertEquals(1,result);
    }
    @Test
    public void isHigherTest(){
        Point myPoint = new Point("a1",2,2);
        Point myPointSecond = new Point("a2",3,3);
        boolean result = myPoint.isHigher(myPointSecond);
        assertEquals(false,result);

    }
}
