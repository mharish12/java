package com.h12.examples.behaviourpatterns.visitor;

public interface ReportVisitor<R> {
  public R visit(FixedPriceContract contract);
  public R visit(TimeAndMaterialsContract contract);
  public R visit(SupportContract contract);
}
