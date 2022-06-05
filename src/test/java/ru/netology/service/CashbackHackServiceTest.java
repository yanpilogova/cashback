package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testIfBoundary1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBoundary800() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBoundary1500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}