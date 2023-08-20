package com.h12.examples.behaviourpatterns.observer;

public interface EventListener {
  void notify(String eventType, String file);
}
