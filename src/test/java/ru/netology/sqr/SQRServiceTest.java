package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateNumbSqrt15() {
        SQRService service = new SQRService();
        int expected = 15;
        int actual = service.calculateNumbSqrt(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumbSqrt16() {
        SQRService service = new SQRService();
        int expected = 16;
        int actual = service.calculateNumbSqrt(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumbSqrt17() {
        SQRService service = new SQRService();
        int expected = 17;
        int actual = service.calculateNumbSqrt(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumbSqrtTestCheck() {
        SQRService service = new SQRService();
        int expected = 18;
        int actual = service.calculateNumbSqrt(200, 300);

        assertEquals(expected, actual);
    }
}