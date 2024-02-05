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

  public static List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      final int currVal = i;

      INTEGERS_TO_STRINGS.forEach((key, value) -> {
          if (currVal % key == 0) sb.append(value);
      });

      String finalString = sb.toString();

      result.add(finalString.isEmpty() ? "" + i : finalString);
    }

    return result;
  }

}
