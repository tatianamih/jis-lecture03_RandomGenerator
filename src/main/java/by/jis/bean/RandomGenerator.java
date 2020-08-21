package by.jis.bean;

import java.security.SecureRandom;


public class RandomGenerator {
    private int a;
    private int b;
    private int c;

    public RandomGenerator() {
        SecureRandom random = new SecureRandom();
        this.a  = random.nextInt(50);
        this.b = random.nextInt(10);
        this.c = random.nextInt(5);
    }

    public int getA() {

        return a;
    }

    public int getB() {

        return b;
    }

    public int getC() {
        return c;
    }
}


