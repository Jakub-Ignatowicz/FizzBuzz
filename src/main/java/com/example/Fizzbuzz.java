package com.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Fizzbuzz {

  private final static LinkedHashMap<Integer, String> INTEGERS_TO_STRINGS = new LinkedHashMap<Integer, String>() {
    {
      put(3, "Fizz");
      put(5, "Buzz");
      put(7, "Jazz");
    }
  };

  private static String fizzBuzzOne(final int i){
    StringBuilder sb = new StringBuilder();

    INTEGERS_TO_STRINGS.forEach((key, value) -> {
      if (i % key == 0) sb.append(value);
    });

    return sb.toString();
  }

  public static List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      String finalString = fizzBuzzOne(i);

      result.add(finalString.isEmpty() ? Integer.toString(i) : finalString);
    }

    return result;
  }

}
