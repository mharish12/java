package com.h12.examples.behaviourpatterns.visitor;

public interface ReportElement {
  <R> R accept(ReportVisitor<R> visitor);
}
