package com.jxfzzzt;

import com.pholser.junit.quickcheck.generator.java.lang.AbstractStringGenerator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class AsciiStringGenerator extends AbstractStringGenerator {
    @Override
    protected int nextCodePoint(SourceOfRandomness sourceOfRandomness) {
        return sourceOfRandomness.nextByte((byte) 0, (byte) 127);
    }

    @Override
    protected boolean codePointInRange(int i) {
        return i >= 1 && i <= 127;
    }
}
