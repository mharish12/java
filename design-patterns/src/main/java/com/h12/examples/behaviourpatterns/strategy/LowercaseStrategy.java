package com.h12.examples.behaviourpatterns.strategy;

public class LowercaseStrategy implements PrintStrategy {

  @Override
  public String formatString(String input) {
    return input.toLowerCase();
  }
  
}
