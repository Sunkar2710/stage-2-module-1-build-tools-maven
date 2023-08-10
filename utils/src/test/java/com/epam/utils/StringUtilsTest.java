package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testNullArgument() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
    @Test
    void testEmptyArgument() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }
    @Test
    void testZeroArgument() {
        assertFalse(StringUtils.isPositiveNumber("0"));}
    @Test
    void  testPositiveArgument() {
        assertTrue(StringUtils.isPositiveNumber("1.1"));
    }
    @Test
    void testZeroBeforeArgument() {
        assertFalse(StringUtils.isPositiveNumber("088"));
    }
    @Test
    void testNegativeArgument() {
        assertFalse(StringUtils.isPositiveNumber("-1.1"));
    }
}