package ru.netology.sqr;

public class SQRService {

    public int calculateNumbSqrt(int bottomLine, int upperLine) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLine && i * i <= upperLine) {
                return i;
            }
        }
        return 0;
    }
}
