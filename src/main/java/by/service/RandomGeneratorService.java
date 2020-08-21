package by.service;

import by.jis.bean.RandomGenerator;

public class RandomGeneratorService {
    public int sumUnboundRandom(RandomGenerator randomGenerator) {
        return randomGenerator.getA() + randomGenerator.getB() + randomGenerator.getC();
    }
}

