package com.h12.examples.structuralpatterns.bridge;

public interface PhoneOS {
  void upload(String data);
  void download(String url);
  void display(String data);
}
