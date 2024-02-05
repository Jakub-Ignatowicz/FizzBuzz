package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    @Test
    void fizzBuzz() {
        assertEquals(List.of("FizzBuzzJazz", "1", "2", "Fizz", "4", "Buzz","Fizz", "Jazz", "8", "Fizz", "Buzz", "11", "Fizz", "13", "Jazz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"),
                Fizzbuzz.fizzBuzz(20));
    }
}