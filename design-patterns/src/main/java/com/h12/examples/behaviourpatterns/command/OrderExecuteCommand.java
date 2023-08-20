package com.h12.examples.behaviourpatterns.command;

public class OrderExecuteCommand implements Command {

  int id;

  public OrderExecuteCommand(int id) {
    this.id = id;
  }

  @Override
  public void execute() {
    System.out.println("Order " + id + " executed");
  }
  
}
