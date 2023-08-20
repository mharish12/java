package com.h12.examples.behaviourpatterns.visitor;

public class FixedPriceContract implements ReportElement {
  long costPerYear;

  public FixedPriceContract(long costPerYear) {
    this.costPerYear = costPerYear;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }
}
