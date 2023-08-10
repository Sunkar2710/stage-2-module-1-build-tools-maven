package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UtilsTest {
    @Test
    void testNullArgument() {
        assertEquals(false, Utils.isAllPositiveNumbers(null));
    }

    @Test
    void testEmptyArgument() {
        assertFalse(Utils.isAllPositiveNumbers(List.of()));
    }
    @Test
    void testEmptyStringArgument() {
        assertFalse(Utils.isAllPositiveNumbers(List.of("")));
    }
    @Test
    void testZeroArgument() {
        assertFalse(Utils.isAllPositiveNumbers(List.of("11", "0")));
    }
    @Test
    void testAllPositiveArguments() {
        assertTrue(Utils.isAllPositiveNumbers(List.of("11.22", "2", "33", "87")));
    }
    @Test
    void testNotAllPositiveArguments() {
        assertFalse(Utils.isAllPositiveNumbers(List.of("-11.22", "2", "33", "87")));
    }
}