package com.h12.examples.behaviourpatterns.strategy;

public class UppercaseStrategy implements PrintStrategy {

  @Override
  public String formatString(String input) {
    return input.toUpperCase();
  }
  
}
