package by.service;

import by.jis.bean.RandomGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomGeneratorServiceTest {

    @Test
    public void sumUnboundRandom() {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService();
        int expected = randomGenerator.getA() + randomGenerator.getB() + randomGenerator.getC();
        int actual = randomGeneratorService.sumUnboundRandom(randomGenerator);
        assertEquals(expected, actual);
    }
}