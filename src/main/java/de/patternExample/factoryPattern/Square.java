package de.patternExample.factoryPattern;

public class Square implements Shape {

  private String name = "Square";

  @Override
  public void draw() {
    System.out.println("Draw Square.");
  }
}
