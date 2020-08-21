package by.jis.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomGeneratorTest {

    @Test
    public void getA() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int expected = randomGenerator.getA();
        int actual = randomGenerator.getA();
        assertEquals(expected, actual);
    }

    @Test
    public void getB() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int expected = randomGenerator.getB();
        int actual = randomGenerator.getB();
        assertEquals(expected, actual);
    }

    @Test
    public void getC() {
        RandomGenerator randomGenerator = new RandomGenerator();
        int expected = randomGenerator.getC();
        int actual = randomGenerator.getC();
        assertEquals(expected, actual);
    }
}